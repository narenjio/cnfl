/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.schemaregistry;

import java.util.List;

/**
 * An interface for validating the compatibility of a single schema against
 * another.
 *
 * <p>What makes one schema compatible with another is not defined by the contract.
 * </p>
 */
public interface SchemaValidationStrategy {

  /**
   * Validates that one schema is compatible with another.
   *
   * @param toValidate The schema to validate
   * @param existing The schema to validate against
   * @return List of error message, other wise empty list
   */
  List<String> validate(ParsedSchema toValidate, ParsedSchema existing);
}
