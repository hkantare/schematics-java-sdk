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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createPolicy options.
 */
public class CreatePolicyOptions extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  /**
   * Policy kind or categories for managing and deriving policy decision
   *   * `agent_assignment_policy` Agent assignment policy for job execution.
   */
  public interface Kind {
    /** agent_assignment_policy. */
    String AGENT_ASSIGNMENT_POLICY = "agent_assignment_policy";
  }

  protected String name;
  protected String description;
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected UserState state;
  protected String kind;
  protected PolicyObjects target;
  protected PolicyParameter parameter;
  protected List<ScopedResource> scopedResources;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private String location;
    private UserState state;
    private String kind;
    private PolicyObjects target;
    private PolicyParameter parameter;
    private List<ScopedResource> scopedResources;

    /**
     * Instantiates a new Builder from an existing CreatePolicyOptions instance.
     *
     * @param createPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreatePolicyOptions createPolicyOptions) {
      this.name = createPolicyOptions.name;
      this.description = createPolicyOptions.description;
      this.resourceGroup = createPolicyOptions.resourceGroup;
      this.tags = createPolicyOptions.tags;
      this.location = createPolicyOptions.location;
      this.state = createPolicyOptions.state;
      this.kind = createPolicyOptions.kind;
      this.target = createPolicyOptions.target;
      this.parameter = createPolicyOptions.parameter;
      this.scopedResources = createPolicyOptions.scopedResources;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreatePolicyOptions.
     *
     * @return the new CreatePolicyOptions instance
     */
    public CreatePolicyOptions build() {
      return new CreatePolicyOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreatePolicyOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds a new element to scopedResources.
     *
     * @param scopedResources the new element to be added
     * @return the CreatePolicyOptions builder
     */
    public Builder addScopedResources(ScopedResource scopedResources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(scopedResources,
        "scopedResources cannot be null");
      if (this.scopedResources == null) {
        this.scopedResources = new ArrayList<ScopedResource>();
      }
      this.scopedResources.add(scopedResources);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreatePolicyOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreatePolicyOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreatePolicyOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreatePolicyOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CreatePolicyOptions builder
     */
    public Builder state(UserState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the CreatePolicyOptions builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreatePolicyOptions builder
     */
    public Builder target(PolicyObjects target) {
      this.target = target;
      return this;
    }

    /**
     * Set the parameter.
     *
     * @param parameter the parameter
     * @return the CreatePolicyOptions builder
     */
    public Builder parameter(PolicyParameter parameter) {
      this.parameter = parameter;
      return this;
    }

    /**
     * Set the scopedResources.
     * Existing scopedResources will be replaced.
     *
     * @param scopedResources the scopedResources
     * @return the CreatePolicyOptions builder
     */
    public Builder scopedResources(List<ScopedResource> scopedResources) {
      this.scopedResources = scopedResources;
      return this;
    }

    /**
     * Set the policy.
     *
     * @param policy the policy
     * @return the CreatePolicyOptions builder
     */
    public Builder policy(Policy policy) {
      this.name = policy.name();
      this.description = policy.description();
      this.resourceGroup = policy.resourceGroup();
      this.tags = policy.tags();
      this.location = policy.location();
      this.state = policy.state();
      this.kind = policy.kind();
      this.target = policy.target();
      this.parameter = policy.parameter();
      this.scopedResources = policy.scopedResources();
      return this;
    }
  }

  protected CreatePolicyOptions() { }

  protected CreatePolicyOptions(Builder builder) {
    name = builder.name;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    location = builder.location;
    state = builder.state;
    kind = builder.kind;
    target = builder.target;
    parameter = builder.parameter;
    scopedResources = builder.scopedResources;
  }

  /**
   * New builder.
   *
   * @return a CreatePolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of Schematics customization policy.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of Schematics customization policy.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group name for the policy.  By default, Policy will be created in `default` Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Tags for the Schematics customization policy.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the state.
   *
   * User defined status of the Schematics object.
   *
   * @return the state
   */
  public UserState state() {
    return state;
  }

  /**
   * Gets the kind.
   *
   * Policy kind or categories for managing and deriving policy decision
   *   * `agent_assignment_policy` Agent assignment policy for job execution.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the target.
   *
   * The objects for the Schematics policy.
   *
   * @return the target
   */
  public PolicyObjects target() {
    return target;
  }

  /**
   * Gets the parameter.
   *
   * The parameter to tune the Schematics policy.
   *
   * @return the parameter
   */
  public PolicyParameter parameter() {
    return parameter;
  }

  /**
   * Gets the scopedResources.
   *
   * List of scoped Schematics resources targeted by the policy.
   *
   * @return the scopedResources
   */
  public List<ScopedResource> scopedResources() {
    return scopedResources;
  }
}

