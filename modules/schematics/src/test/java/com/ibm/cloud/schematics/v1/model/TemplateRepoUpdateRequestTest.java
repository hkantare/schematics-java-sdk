/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.schematics.v1.model.TemplateRepoUpdateRequest;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TemplateRepoUpdateRequest model.
 */
public class TemplateRepoUpdateRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTemplateRepoUpdateRequest() throws Throwable {
    TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .skipSubmodulesCheckout(true)
      .build();
    assertEquals(templateRepoUpdateRequestModel.branch(), "testString");
    assertEquals(templateRepoUpdateRequestModel.release(), "testString");
    assertEquals(templateRepoUpdateRequestModel.repoShaValue(), "testString");
    assertEquals(templateRepoUpdateRequestModel.repoUrl(), "testString");
    assertEquals(templateRepoUpdateRequestModel.url(), "testString");
    assertEquals(templateRepoUpdateRequestModel.skipSubmodulesCheckout(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(templateRepoUpdateRequestModel);

    TemplateRepoUpdateRequest templateRepoUpdateRequestModelNew = TestUtilities.deserialize(json, TemplateRepoUpdateRequest.class);
    assertTrue(templateRepoUpdateRequestModelNew instanceof TemplateRepoUpdateRequest);
    assertEquals(templateRepoUpdateRequestModelNew.branch(), "testString");
    assertEquals(templateRepoUpdateRequestModelNew.release(), "testString");
    assertEquals(templateRepoUpdateRequestModelNew.repoShaValue(), "testString");
    assertEquals(templateRepoUpdateRequestModelNew.repoUrl(), "testString");
    assertEquals(templateRepoUpdateRequestModelNew.url(), "testString");
    assertEquals(templateRepoUpdateRequestModelNew.skipSubmodulesCheckout(), Boolean.valueOf(true));
  }
}