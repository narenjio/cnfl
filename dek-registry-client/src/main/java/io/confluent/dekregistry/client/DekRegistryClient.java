/*
 * Copyright 2021 Confluent Inc.
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

package io.confluent.dekregistry.client;

import io.confluent.dekregistry.client.rest.entities.Dek;
import io.confluent.kafka.schemaregistry.encryption.tink.DekFormat;
import io.confluent.dekregistry.client.rest.entities.Kek;
import io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface DekRegistryClient {

  List<String> listKeks(boolean lookupDeleted)
      throws IOException, RestClientException;

  Kek getKek(String name, boolean lookupDeleted)
      throws IOException, RestClientException;

  List<String> listDeks(String kekName, boolean lookupDeleted)
      throws IOException, RestClientException;

  Dek getDek(String name, String scope, boolean lookupDeleted)
      throws IOException, RestClientException;

  Dek getDek(String name, String scope, DekFormat algorithm, boolean lookupDeleted)
      throws IOException, RestClientException;

  Kek createKek(
      String name,
      String kmsType,
      String kmsKeyId,
      Map<String, String> kmsProps,
      String doc,
      boolean shared)
      throws IOException, RestClientException;

  Dek createDek(
      String kekName,
      String kmsType,
      String kmsKeyId,
      String scope,
      DekFormat algorithm,
      String encryptedKeyMaterial)
      throws IOException, RestClientException;

  Kek updateKek(
      String name,
      Map<String, String> kmsProps,
      String doc,
      Boolean shared)
      throws IOException, RestClientException;

  void deleteKek(String name, boolean permanentDelete)
      throws IOException, RestClientException;

  void deleteDek(String name, String scope, boolean permanentDelete)
      throws IOException, RestClientException;

  void deleteDek(String name, String scope, DekFormat algorithm, boolean permanentDelete)
      throws IOException, RestClientException;
}
