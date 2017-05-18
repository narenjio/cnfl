/**
 * Copyright 2014 Confluent Inc.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.schemaregistry.rest;

import io.confluent.kafka.schemaregistry.exceptions.SchemaRegistryException;
import io.confluent.kafka.schemaregistry.rest.resources.CompatibilityResource;
import io.confluent.kafka.schemaregistry.rest.resources.ConfigResource;
import io.confluent.kafka.schemaregistry.rest.resources.RootResource;
import io.confluent.kafka.schemaregistry.rest.resources.SchemasResource;
import io.confluent.kafka.schemaregistry.rest.resources.SubjectVersionsResource;
import io.confluent.kafka.schemaregistry.rest.resources.SubjectsResource;
import io.confluent.kafka.schemaregistry.storage.KafkaSchemaRegistry;
import io.confluent.kafka.schemaregistry.storage.serialization.SchemaRegistrySerializer;
import io.confluent.rest.Application;
import io.confluent.rest.RestConfig;
import io.confluent.rest.RestConfigException;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.ws.rs.core.Configurable;
import java.util.Map;
import java.util.Properties;

public class SchemaRegistryRestApplication extends Application<SchemaRegistryConfig> {

  private static final Logger log = LoggerFactory.getLogger(SchemaRegistryRestApplication.class);
  private KafkaSchemaRegistry schemaRegistry = null;

  public SchemaRegistryRestApplication(Properties props) throws RestConfigException {
    this(new SchemaRegistryConfig(props));
  }

  public SchemaRegistryRestApplication(SchemaRegistryConfig config) {
    super(config);
  }

  @Override
  public void setupResources(Configurable<?> config, SchemaRegistryConfig schemaRegistryConfig) {
    try {
      schemaRegistry = new KafkaSchemaRegistry(schemaRegistryConfig,
              new SchemaRegistrySerializer());
      schemaRegistry.init();
    } catch (SchemaRegistryException e) {
      log.error("Error starting the schema registry", e);
      System.exit(1);
    }
    config.register(RootResource.class);
    config.register(new ConfigResource(schemaRegistry));
    config.register(new SubjectsResource(schemaRegistry));
    config.register(new SchemasResource(schemaRegistry));
    config.register(new SubjectVersionsResource(schemaRegistry));
    config.register(new CompatibilityResource(schemaRegistry));
  }

  protected void configurePreResourceHandling(final ServletContextHandler context) {
    if (config.getBoolean(RestConfig.AUTHORIZATION_ENABLED_CONFIG)) {
      Filter filter = config
              .getConfiguredInstance(RestConfig.AUTHORIZATION_FILTER_CLASS_CONFIG, Filter.class);
      FilterHolder authorizationFilterHolder = new FilterHolder(filter);
      if (!(filter instanceof org.apache.kafka.common.Configurable)) {
        authorizationFilterHolder
                .setInitParameters((Map<String, String>) (Map) config.originalsWithPrefix(""));
      }
      String authorizationPath = "/subjects/*";
      if (!RestConfig.AUTHORIZATION_FILTER_PATH_DEFAULT
              .equals(config.getString(RestConfig.AUTHORIZATION_SUPER_USERS_CONFIG))) {
        authorizationPath = config.getString(RestConfig.AUTHORIZATION_FILTER_PATH_CONFIG);
      }
      context.addFilter(authorizationFilterHolder, authorizationPath, null);
    }
  }

  @Override
  public void onShutdown() {
    schemaRegistry.close();
  }

  // for testing purpose only
  public KafkaSchemaRegistry schemaRegistry() {
    return schemaRegistry;
  }
}
