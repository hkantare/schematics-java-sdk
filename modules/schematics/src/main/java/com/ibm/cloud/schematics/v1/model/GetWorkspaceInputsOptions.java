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
 * The getWorkspaceInputs options.
 */
public class GetWorkspaceInputsOptions extends GenericModel {

  protected String wId;
  protected String tId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String tId;

    /**
     * Instantiates a new Builder from an existing GetWorkspaceInputsOptions instance.
     *
     * @param getWorkspaceInputsOptions the instance to initialize the Builder with
     */
    private Builder(GetWorkspaceInputsOptions getWorkspaceInputsOptions) {
      this.wId = getWorkspaceInputsOptions.wId;
      this.tId = getWorkspaceInputsOptions.tId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param tId the tId
     */
    public Builder(String wId, String tId) {
      this.wId = wId;
      this.tId = tId;
    }

    /**
     * Builds a GetWorkspaceInputsOptions.
     *
     * @return the new GetWorkspaceInputsOptions instance
     */
    public GetWorkspaceInputsOptions build() {
      return new GetWorkspaceInputsOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetWorkspaceInputsOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the tId.
     *
     * @param tId the tId
     * @return the GetWorkspaceInputsOptions builder
     */
    public Builder tId(String tId) {
      this.tId = tId;
      return this;
    }
  }

  protected GetWorkspaceInputsOptions() { }

  protected GetWorkspaceInputsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tId,
      "tId cannot be empty");
    wId = builder.wId;
    tId = builder.tId;
  }

  /**
   * New builder.
   *
   * @return a GetWorkspaceInputsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace.  To find the workspace ID, use the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the tId.
   *
   * The ID of the Terraform template in your workspace.  When you create a workspace, the Terraform template that  your
   * workspace points to is assigned a unique ID. Use the `GET /v1/workspaces` to look up the workspace IDs  and
   * template IDs or `template_data.id` in your IBM Cloud account.
   *
   * @return the tId
   */
  public String tId() {
    return tId;
  }
}

