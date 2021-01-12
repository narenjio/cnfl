/*
 * Copyright 2018 Confluent Inc.
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

package io.confluent.kafka.serializers;


import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.Importance;
import org.apache.kafka.common.config.ConfigDef.Type;

import java.util.Map;

public class KafkaAvroDeserializerConfig extends AbstractKafkaSchemaSerDeConfig {

  public static final String SPECIFIC_AVRO_READER_CONFIG = "specific.avro.reader";
  public static final boolean SPECIFIC_AVRO_READER_DEFAULT = false;
  public static final String SPECIFIC_AVRO_READER_DOC =
      "If true, tries to look up the SpecificRecord class ";

  public static final String AVRO_REFLECTION_ALLOW_NULL_CONFIG = "avro.reflection.allow.null";
  public static final boolean AVRO_REFLECTION_ALLOW_NULL_DEFAULT = false;
  public static final String AVRO_REFLECTION_ALLOW_NULL_DOC =
      "If true, allows null field values used in ReflectionAvroDeserializer";

  private static ConfigDef config;

  static {
    config = baseConfigDef()
        .define(SPECIFIC_AVRO_READER_CONFIG, Type.BOOLEAN, SPECIFIC_AVRO_READER_DEFAULT,
                Importance.LOW, SPECIFIC_AVRO_READER_DOC)
        .define(AVRO_REFLECTION_ALLOW_NULL_CONFIG, Type.BOOLEAN, AVRO_REFLECTION_ALLOW_NULL_DEFAULT,
            Importance.MEDIUM, AVRO_REFLECTION_ALLOW_NULL_DOC);
  }

  public KafkaAvroDeserializerConfig(Map<?, ?> props) {
    super(config, props);
  }
}
