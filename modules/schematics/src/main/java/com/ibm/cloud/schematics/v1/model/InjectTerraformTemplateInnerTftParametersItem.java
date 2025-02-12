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
 * InjectTerraformTemplateInnerTftParametersItem.
 */
public class InjectTerraformTemplateInnerTftParametersItem extends GenericModel {

  protected String name;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;

    /**
     * Instantiates a new Builder from an existing InjectTerraformTemplateInnerTftParametersItem instance.
     *
     * @param injectTerraformTemplateInnerTftParametersItem the instance to initialize the Builder with
     */
    private Builder(InjectTerraformTemplateInnerTftParametersItem injectTerraformTemplateInnerTftParametersItem) {
      this.name = injectTerraformTemplateInnerTftParametersItem.name;
      this.value = injectTerraformTemplateInnerTftParametersItem.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InjectTerraformTemplateInnerTftParametersItem.
     *
     * @return the new InjectTerraformTemplateInnerTftParametersItem instance
     */
    public InjectTerraformTemplateInnerTftParametersItem build() {
      return new InjectTerraformTemplateInnerTftParametersItem(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InjectTerraformTemplateInnerTftParametersItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the InjectTerraformTemplateInnerTftParametersItem builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected InjectTerraformTemplateInnerTftParametersItem() { }

  protected InjectTerraformTemplateInnerTftParametersItem(Builder builder) {
    name = builder.name;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a InjectTerraformTemplateInnerTftParametersItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Key name to replace.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value to replace.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

