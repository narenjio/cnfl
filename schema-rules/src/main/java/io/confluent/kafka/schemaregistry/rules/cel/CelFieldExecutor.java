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

package io.confluent.kafka.schemaregistry.rules.cel;

import io.confluent.kafka.schemaregistry.rules.FieldRuleExecutor;
import io.confluent.kafka.schemaregistry.rules.FieldTransform;
import io.confluent.kafka.schemaregistry.rules.RuleContext;
import java.util.ArrayList;
import java.util.HashMap;

public class CelFieldExecutor implements FieldRuleExecutor {

  public static final String TYPE = "CEL_FIELD";

  public String type() {
    return TYPE;
  }

  @Override
  public FieldTransform newTransform(RuleContext ruleContext) {
    return (ctx, fieldCtx, fieldValue) ->
        CelExecutor.execute(ctx, fieldValue, new HashMap<String, Object>() {
              {
                put("value", fieldValue);  // fieldValue may be null
                put("fullName", fieldCtx.getFullName());
                put("name", fieldCtx.getName());
                put("typeName", fieldCtx.getType().name());
                put("tags", new ArrayList<>(fieldCtx.getTags()));
                put("message", fieldCtx.getContainingMessage());
              }
            }
        );
  }
}
