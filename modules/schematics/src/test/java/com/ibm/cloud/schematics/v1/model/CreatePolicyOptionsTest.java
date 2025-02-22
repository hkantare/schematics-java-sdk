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

import com.ibm.cloud.schematics.v1.model.AgentAssignmentPolicyParameter;
import com.ibm.cloud.schematics.v1.model.CreatePolicyOptions;
import com.ibm.cloud.schematics.v1.model.PolicyObjectSelector;
import com.ibm.cloud.schematics.v1.model.PolicyObjects;
import com.ibm.cloud.schematics.v1.model.PolicyParameter;
import com.ibm.cloud.schematics.v1.model.ScopedResource;
import com.ibm.cloud.schematics.v1.model.UserState;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePolicyOptions model.
 */
public class CreatePolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePolicyOptions() throws Throwable {
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(userStateModel.state(), "draft");
    assertEquals(userStateModel.setBy(), "testString");
    assertEquals(userStateModel.setAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

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

    AgentAssignmentPolicyParameter agentAssignmentPolicyParameterModel = new AgentAssignmentPolicyParameter.Builder()
      .selectorKind("ids")
      .selectorIds(java.util.Arrays.asList("testString"))
      .selectorScope(java.util.Arrays.asList(policyObjectSelectorModel))
      .build();
    assertEquals(agentAssignmentPolicyParameterModel.selectorKind(), "ids");
    assertEquals(agentAssignmentPolicyParameterModel.selectorIds(), java.util.Arrays.asList("testString"));
    assertEquals(agentAssignmentPolicyParameterModel.selectorScope(), java.util.Arrays.asList(policyObjectSelectorModel));

    PolicyParameter policyParameterModel = new PolicyParameter.Builder()
      .agentAssignmentPolicyParameter(agentAssignmentPolicyParameterModel)
      .build();
    assertEquals(policyParameterModel.agentAssignmentPolicyParameter(), agentAssignmentPolicyParameterModel);

    ScopedResource scopedResourceModel = new ScopedResource.Builder()
      .kind("workspace")
      .id("testString")
      .build();
    assertEquals(scopedResourceModel.kind(), "workspace");
    assertEquals(scopedResourceModel.id(), "testString");

    CreatePolicyOptions createPolicyOptionsModel = new CreatePolicyOptions.Builder()
      .name("Agent1-DevWS")
      .description("Policy for job execution of secured workspaces on agent1")
      .resourceGroup("Default")
      .tags(java.util.Arrays.asList("policy:secured-job"))
      .location("us-south")
      .state(userStateModel)
      .kind("agent_assignment_policy")
      .target(policyObjectsModel)
      .parameter(policyParameterModel)
      .scopedResources(java.util.Arrays.asList(scopedResourceModel))
      .build();
    assertEquals(createPolicyOptionsModel.name(), "Agent1-DevWS");
    assertEquals(createPolicyOptionsModel.description(), "Policy for job execution of secured workspaces on agent1");
    assertEquals(createPolicyOptionsModel.resourceGroup(), "Default");
    assertEquals(createPolicyOptionsModel.tags(), java.util.Arrays.asList("policy:secured-job"));
    assertEquals(createPolicyOptionsModel.location(), "us-south");
    assertEquals(createPolicyOptionsModel.state(), userStateModel);
    assertEquals(createPolicyOptionsModel.kind(), "agent_assignment_policy");
    assertEquals(createPolicyOptionsModel.target(), policyObjectsModel);
    assertEquals(createPolicyOptionsModel.parameter(), policyParameterModel);
    assertEquals(createPolicyOptionsModel.scopedResources(), java.util.Arrays.asList(scopedResourceModel));
  }
}