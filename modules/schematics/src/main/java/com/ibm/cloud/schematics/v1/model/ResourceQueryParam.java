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
 * Describe resource query param.
 */
public class ResourceQueryParam extends GenericModel {

  protected String name;
  protected String value;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private String description;

    /**
     * Instantiates a new Builder from an existing ResourceQueryParam instance.
     *
     * @param resourceQueryParam the instance to initialize the Builder with
     */
    private Builder(ResourceQueryParam resourceQueryParam) {
      this.name = resourceQueryParam.name;
      this.value = resourceQueryParam.value;
      this.description = resourceQueryParam.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResourceQueryParam.
     *
     * @return the new ResourceQueryParam instance
     */
    public ResourceQueryParam build() {
      return new ResourceQueryParam(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ResourceQueryParam builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ResourceQueryParam builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ResourceQueryParam builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected ResourceQueryParam() { }

  protected ResourceQueryParam(Builder builder) {
    name = builder.name;
    value = builder.value;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a ResourceQueryParam builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the resource query param.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * Value of the resource query param.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the description.
   *
   * Description of resource query param variable.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

