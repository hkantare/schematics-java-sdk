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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteAgentData options.
 */
public class DeleteAgentDataOptions extends GenericModel {

  protected String agentId;
  protected Boolean force;

  /**
   * Builder.
   */
  public static class Builder {
    private String agentId;
    private Boolean force;

    /**
     * Instantiates a new Builder from an existing DeleteAgentDataOptions instance.
     *
     * @param deleteAgentDataOptions the instance to initialize the Builder with
     */
    private Builder(DeleteAgentDataOptions deleteAgentDataOptions) {
      this.agentId = deleteAgentDataOptions.agentId;
      this.force = deleteAgentDataOptions.force;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param agentId the agentId
     */
    public Builder(String agentId) {
      this.agentId = agentId;
    }

    /**
     * Builds a DeleteAgentDataOptions.
     *
     * @return the new DeleteAgentDataOptions instance
     */
    public DeleteAgentDataOptions build() {
      return new DeleteAgentDataOptions(this);
    }

    /**
     * Set the agentId.
     *
     * @param agentId the agentId
     * @return the DeleteAgentDataOptions builder
     */
    public Builder agentId(String agentId) {
      this.agentId = agentId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteAgentDataOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }
  }

  protected DeleteAgentDataOptions() { }

  protected DeleteAgentDataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.agentId,
      "agentId cannot be empty");
    agentId = builder.agentId;
    force = builder.force;
  }

  /**
   * New builder.
   *
   * @return a DeleteAgentDataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the agentId.
   *
   * Agent ID to get the details of agent.
   *
   * @return the agentId
   */
  public String agentId() {
    return agentId;
  }

  /**
   * Gets the force.
   *
   * Equivalent to -force options in the command line, default is false.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }
}

