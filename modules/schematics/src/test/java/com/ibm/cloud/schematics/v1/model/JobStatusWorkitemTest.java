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

import com.ibm.cloud.schematics.v1.model.JobStatusWorkitem;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatusWorkitem model.
 */
public class JobStatusWorkitemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatusWorkitem() throws Throwable {
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
      .workspaceId("testString")
      .workspaceName("testString")
      .jobId("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(jobStatusWorkitemModel.workspaceId(), "testString");
    assertEquals(jobStatusWorkitemModel.workspaceName(), "testString");
    assertEquals(jobStatusWorkitemModel.jobId(), "testString");
    assertEquals(jobStatusWorkitemModel.statusCode(), "job_pending");
    assertEquals(jobStatusWorkitemModel.statusMessage(), "testString");
    assertEquals(jobStatusWorkitemModel.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(jobStatusWorkitemModel);

    JobStatusWorkitem jobStatusWorkitemModelNew = TestUtilities.deserialize(json, JobStatusWorkitem.class);
    assertTrue(jobStatusWorkitemModelNew instanceof JobStatusWorkitem);
    assertEquals(jobStatusWorkitemModelNew.workspaceId(), "testString");
    assertEquals(jobStatusWorkitemModelNew.workspaceName(), "testString");
    assertEquals(jobStatusWorkitemModelNew.jobId(), "testString");
    assertEquals(jobStatusWorkitemModelNew.statusCode(), "job_pending");
    assertEquals(jobStatusWorkitemModelNew.statusMessage(), "testString");
    assertEquals(jobStatusWorkitemModelNew.updatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}