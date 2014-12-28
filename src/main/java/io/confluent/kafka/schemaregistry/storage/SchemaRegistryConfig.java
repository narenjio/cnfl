/**
 * Copyright 2014 Confluent Inc.
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

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

import static org.apache.kafka.common.config.ConfigDef.Range.atLeast;

public class SchemaRegistryConfig extends AbstractConfig {

  /**
   * <code>port</code>
   */
  public static final String PORT_CONFIG = "port";
  protected static final String PORT_DOC = "Port to bind the HTTP servlet";
  public static final int DEFAULT_PORT = 8080;


  /**
   * <code>kafkastore.connection.url</code>
   */
  public static final String KAFKASTORE_CONNECTION_URL_CONFIG = "kafkastore.connection.url";
  protected static final String KAFKASTORE_CONNECTION_URL_DOC =
      "Zookeeper url for the Kafka cluster";

  /**
   * <code>kafkastore.zk.session.timeout.ms</code>
   */
  public static final String KAFKASTORE_ZK_SESSION_TIMEOUT_MS_CONFIG
      = "kafkastore.zk.session.timeout.ms";
  protected static final String KAFKASTORE_ZK_SESSION_TIMEOUT_MS_DOC =
      "Zookeeper session timeout";

  /**
   * <code>kafkastore.topic</code>
   */
  public static final String KAFKASTORE_TOPIC_CONFIG = "kafkastore.topic";
  public static final String DEFAULT_KAFKASTORE_TOPIC = "_schemas";
  protected static final String KAFKASTORE_TOPIC_DOC =
      "The durable single partition topic that acts" +
      "as the durable log for the data";

  /**
   * <code>kafkastore.timeout.ms</code>
   */
  public static final String KAFKASTORE_TIMEOUT_CONFIG = "kafkastore.timeout.ms";
  protected static final String KAFKASTORE_TIMEOUT_DOC =
      "The timeout for an operation on the Kafka store";

  /**
   * <code>kafkastore.commit.interval.ms</code>
   */
  public static final String KAFKASTORE_COMMIT_INTERVAL_MS_CONFIG = "kafkastore.commit.interval.ms";
  protected static final String KAFKASTORE_COMMIT_INTERVAL_MS_DOC =
      "The interval to commit offsets while consuming the Kafka topic";

  /**
   * <code>advertised.host</code>
   */
  public static final String ADVERTISED_HOST_CONFIG = "advertised.host";
  protected static final String ADVERTISED_HOST_DOC = "The host name advertised in Zookeeper";


  protected static final ConfigDef config = new ConfigDef()
      .define(PORT_CONFIG, ConfigDef.Type.INT, DEFAULT_PORT, ConfigDef.Importance.LOW, PORT_DOC)
      .define(KAFKASTORE_CONNECTION_URL_CONFIG, ConfigDef.Type.STRING, ConfigDef.Importance.HIGH,
              KAFKASTORE_CONNECTION_URL_DOC)
      .define(KAFKASTORE_ZK_SESSION_TIMEOUT_MS_CONFIG, ConfigDef.Type.INT, 10000, atLeast(0),
              ConfigDef.Importance.LOW, KAFKASTORE_ZK_SESSION_TIMEOUT_MS_DOC)
      .define(KAFKASTORE_TOPIC_CONFIG, ConfigDef.Type.STRING, DEFAULT_KAFKASTORE_TOPIC,
              ConfigDef.Importance.HIGH, KAFKASTORE_TOPIC_DOC)
      .define(KAFKASTORE_TIMEOUT_CONFIG, ConfigDef.Type.INT, 500, atLeast(0),
              ConfigDef.Importance.MEDIUM, KAFKASTORE_TIMEOUT_DOC)
      .define(KAFKASTORE_COMMIT_INTERVAL_MS_CONFIG, ConfigDef.Type.INT, 60000, atLeast(0),
              ConfigDef.Importance.MEDIUM,
              KAFKASTORE_COMMIT_INTERVAL_MS_DOC)
      .define(ADVERTISED_HOST_CONFIG, ConfigDef.Type.STRING, getDefaultHost(),
              ConfigDef.Importance.LOW, ADVERTISED_HOST_DOC);

  private static String getDefaultHost() {
    try {
      return InetAddress.getLocalHost().getCanonicalHostName();
    } catch (UnknownHostException e) {
      throw new ConfigException("Unknown local hostname", e);
    }
  }

  public SchemaRegistryConfig(ConfigDef arg0, Map<?, ?> arg1) {
    super(arg0, arg1);
  }

  public SchemaRegistryConfig(Map<? extends Object, ? extends Object> props) {
    super(config, props);
  }

  public static void main(String[] args) {
    System.out.println(config.toHtmlTable());
  }
}
