/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.schematics.v1.model.PolicyObjectSelector;
import com.ibm.cloud.schematics.v1.model.PolicyObjects;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PolicyObjects model.
 */
public class PolicyObjectsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPolicyObjects() throws Throwable {
    PolicyObjectSelector policyObjectSelectorModel = new PolicyObjectSelector.Builder()
      .kind("workspace")
      .tags(java.util.Arrays.asList("testString"))
      .resourceGroups(java.util.Arrays.asList("testString"))
      .locations(java.util.Arrays.asList("us-south"))
      .build();
    assertEquals(policyObjectSelectorModel.kind(), "workspace");
    assertEquals(policyObjectSelectorModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(policyObjectSelectorModel.resourceGroups(), java.util.Arrays.asList("testString"));
    assertEquals(policyObjectSelectorModel.locations(), java.util.Arrays.asList("us-south"));

    PolicyObjects policyObjectsModel = new PolicyObjects.Builder()
      .selectorKind("ids")
      .selectorIds(java.util.Arrays.asList("testString"))
      .selectorScope(java.util.Arrays.asList(policyObjectSelectorModel))
      .build();
    assertEquals(policyObjectsModel.selectorKind(), "ids");
    assertEquals(policyObjectsModel.selectorIds(), java.util.Arrays.asList("testString"));
    assertEquals(policyObjectsModel.selectorScope(), java.util.Arrays.asList(policyObjectSelectorModel));

    String json = TestUtilities.serialize(policyObjectsModel);

    PolicyObjects policyObjectsModelNew = TestUtilities.deserialize(json, PolicyObjects.class);
    assertTrue(policyObjectsModelNew instanceof PolicyObjects);
    assertEquals(policyObjectsModelNew.selectorKind(), "ids");
  }
}