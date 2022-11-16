/*
 * Copyright 2022 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.schemaregistry.maven.derive.schema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.confluent.kafka.schemaregistry.avro.AvroSchema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DeriveAvroSchema extends DeriveSchema {

  public static final String DOUBLE = "double";
  public static final String STRING = "string";
  public static final String BOOLEAN = "boolean";
  public static final String INT = "int";
  public static final String LONG = "long";
  public static final String NULL = "null";

  public DeriveAvroSchema() {
    // Map jackson node data type to type understood by avro
    classToDataType.put(com.fasterxml.jackson.databind.node.DoubleNode.class.getName(), DOUBLE);
    classToDataType.put(com.fasterxml.jackson.databind.node.TextNode.class.getName(), STRING);
    classToDataType.put(com.fasterxml.jackson.databind.node.BigIntegerNode.class.getName(), DOUBLE);
    classToDataType.put(com.fasterxml.jackson.databind.node.IntNode.class.getName(), INT);
    classToDataType.put(com.fasterxml.jackson.databind.node.LongNode.class.getName(), LONG);
    classToDataType.put(com.fasterxml.jackson.databind.node.BooleanNode.class.getName(), BOOLEAN);
    classToDataType.put(com.fasterxml.jackson.databind.node.NullNode.class.getName(), NULL);
    classToDataType.put(com.fasterxml.jackson.databind.node.MissingNode.class.getName(), NULL);
  }

  @Override
  protected ObjectNode mergeMultipleDataTypes(ObjectNode mergedArray,
                                              List<JsonNode> primitives,
                                              List<JsonNode> records,
                                              List<JsonNode> arrays,
                                              boolean check2dArray) {
    mergeUnions(records, primitives);
    DeriveSchemaUtils.mergeNumberTypes(primitives);
    primitives = DeriveSchemaUtils.getUnique(primitives);
    // To recursively merge number types in-place for records and arrays, the result is ignored
    if (records.size() > 0) {
      mergeRecords(records);
    }
    if (arrays.size() > 0) {
      mergeArrays(arrays, true, false);
    }
    List<JsonNode> dataTypes = new ArrayList<>();
    for (List<JsonNode> types : Arrays.asList(arrays, records, primitives)) {
      dataTypes.addAll(types);
    }
    ArrayNode items = mapper.createArrayNode().addAll(DeriveSchemaUtils.getUnique(dataTypes));
    getSingleDataType(mergedArray, items);
    return mergedArray;
  }

  /**
   * Convert json schema template to avro format and validate generated schema
   */
  protected JsonNode convertToFormat(JsonNode schema, String name) {
    ObjectNode schemaForRecord = convertToFormatForRecord(schema, name);
    AvroSchema avroSchema = new AvroSchema(schemaForRecord.toString());
    avroSchema.validate();
    try {
      return mapper.readTree(avroSchema.toString());
    } catch (JsonProcessingException e) {
      return schema;
    }
  }

  protected ObjectNode convertToFormatForRecord(JsonNode schema, String name) {
    ObjectNode recordSchemaAvro = mapper.createObjectNode().put("type", "record");
    recordSchemaAvro.put("name", name);
    JsonNode properties = schema.get("properties");
    ArrayNode fields = mapper.createArrayNode();
    for (String fieldName : DeriveSchemaUtils.getSortedKeys(properties)) {
      ObjectNode fieldSchemaAvro = mapper.createObjectNode().put("name", fieldName);
      setSchemaFields(fieldSchemaAvro, properties.get(fieldName), "type", fieldName);
      fields.add(fieldSchemaAvro);
    }
    recordSchemaAvro.set("fields", fields);
    return recordSchemaAvro;
  }

  protected ObjectNode convertToFormatArray(JsonNode schema, String name) {
    ObjectNode arraySchemaAvro = mapper.createObjectNode().put("type", "array");
    setSchemaFields(arraySchemaAvro, schema.get("items"), "items", name);
    return arraySchemaAvro;
  }

  private void setSchemaFields(ObjectNode arraySchemaAvro, JsonNode items,
                               String fieldType, String name) {
    String itemsType = items.get("type").asText();
    switch (itemsType) {
      case "object":
        arraySchemaAvro.set(fieldType, convertToFormat(items, name));
        break;
      case "array":
        arraySchemaAvro.set(fieldType, convertToFormatArray(items, name));
        break;
      case "union":
        ArrayNode unionBranches = (ArrayNode) items.get("properties");
        convertToFormatUnion(unionBranches);
        arraySchemaAvro.set(fieldType, unionBranches);
        break;
      default:
        arraySchemaAvro.put(fieldType, itemsType);
        break;
    }
  }

  private void convertToFormatUnion(ArrayNode unionBranches) {
    for (int i = 0; i < unionBranches.size(); i++) {
      if (unionBranches.get(i).get("type").asText().equals("object")) {
        unionBranches.set(i, convertToFormat(unionBranches.get(i),
            unionBranches.get(i).get("__name").asText()));
      }
    }
  }

  /**
   * Check for fields with type union and null value, and if possible merge them
   * Check recursively for records if there are multiple types
   */
  protected void mergeUnions(List<JsonNode> records, List<JsonNode> primitives) {
    Map<String, List<JsonNode>> nameToField = new HashMap<>();
    boolean typeUnion = true;
    for (JsonNode record : records) {
      JsonNode properties = record.get("properties");
      // A record with only one field can be of type union
      if (properties.size() != 1) {
        typeUnion = false;
      }
      for (Iterator<String> it = properties.fieldNames(); it.hasNext(); ) {
        if (!checkForUnion(it.next(), properties, nameToField)) {
          typeUnion = false;
        }
      }
    }

    // Grouping all the fields by name, if there are more than 1 distinct records then we need to
    // recursively merge them and check for unions inside them
    List<JsonNode> branches = new ArrayList<>();
    for (Map.Entry<String, List<JsonNode>> entry : nameToField.entrySet()) {
      List<JsonNode> uniqueRecords = DeriveSchemaUtils.getUnique(entry.getValue());
      JsonNode mergedArray = mergeArrays(uniqueRecords, false, false).get("items");
      DeriveSchemaUtils.replaceEachField(mergedArray, entry.getValue());
      branches.add(uniqueRecords.get(0));
    }

    if (typeUnion) {
      updateUnionBranches(records, primitives, branches);
    }
  }

  /**
   * Check whether the name of the field and their data type match to be of type union
   */
  private boolean checkForUnion(String fieldName, JsonNode properties,
                                Map<String, List<JsonNode>> nameToField) {
    List<String> numTypes = Arrays.asList(INT, LONG, DOUBLE);
    List<String> otherUnionTypes = Arrays.asList(STRING, BOOLEAN, "array");
    ObjectNode field = (ObjectNode) properties.get(fieldName);
    String fieldType = field.get("type").asText();
    boolean unionType = false;
    if (fieldType.equals("object") || fieldType.equals(NULL)) {
      field.put("__name", fieldName);
      unionType = true;
    } else if ((numTypes.contains(fieldName) && numTypes.contains(fieldType))
        || (otherUnionTypes.contains(fieldType) && fieldType.equals(fieldName))) {
      field.put("type", fieldName);
      unionType = true;
    }

    if (unionType) {
      List<JsonNode> fields = nameToField.getOrDefault(fieldName, new ArrayList<>());
      fields.add(field);
      nameToField.put(fieldName, fields);
    }
    return unionType;
  }

  private void updateUnionBranches(List<JsonNode> records, List<JsonNode> primitives,
                                   List<JsonNode> branches) {
    boolean hasNull = primitives.stream().anyMatch(o -> o.get("type").asText().equals(NULL));
    if (hasNull) {
      branches.add(getNullSchema());
    }
    List<JsonNode> uniqueBranches = DeriveSchemaUtils.getUnique(branches);
    List<String> primitiveTypes = Arrays.asList(INT, LONG, DOUBLE, STRING, BOOLEAN);
    boolean checkForSinglePrimitiveBranch = uniqueBranches.size() == 1
        && primitiveTypes.contains(uniqueBranches.get(0).get("type").asText());
    if (uniqueBranches.size() > 1 || checkForSinglePrimitiveBranch) {
      if (hasNull) {
        primitives.removeIf(o -> o.get("type").asText().equals(NULL));
      }
      ArrayNode properties = mapper.createArrayNode().addAll(uniqueBranches);
      for (JsonNode record : records) {
        ObjectNode objectNode = (ObjectNode) record;
        objectNode.put("type", "union");
        objectNode.set("properties", properties);
      }
    }
  }
}
