/*
 * Copyright 2023 Confluent Inc.
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

package io.confluent.kafka.schemaregistry.storage;

import io.confluent.kafka.schemaregistry.client.rest.entities.requests.RegisterSchemaRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleSetHandler {

  private static final Logger log = LoggerFactory.getLogger(KafkaStore.class);

  public RuleSetHandler() {
  }

  public RegisterSchemaRequest filter(RegisterSchemaRequest request) {
    if (request.getRuleSet() != null) {
      log.warn("RuleSets are only supported by Confluent Enterprise and Confluent Cloud");
    }
    return new RegisterSchemaRequest(
        request.getVersion(),
        request.getId(),
        request.getSchemaType(),
        request.getReferences(),
        request.getMetadata(),
        null,
        request.getSchema()
    );
  }

  public RuleSet transform(io.confluent.kafka.schemaregistry.client.rest.entities.RuleSet ruleSet) {
    return null;
  }
}
