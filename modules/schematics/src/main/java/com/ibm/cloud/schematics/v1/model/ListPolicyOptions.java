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
 * The listPolicy options.
 */
public class ListPolicyOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
    /** ids. */
    String IDS = "ids";
  }

  protected Long offset;
  protected Long limit;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String profile;

    /**
     * Instantiates a new Builder from an existing ListPolicyOptions instance.
     *
     * @param listPolicyOptions the instance to initialize the Builder with
     */
    private Builder(ListPolicyOptions listPolicyOptions) {
      this.offset = listPolicyOptions.offset;
      this.limit = listPolicyOptions.limit;
      this.profile = listPolicyOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListPolicyOptions.
     *
     * @return the new ListPolicyOptions instance
     */
    public ListPolicyOptions build() {
      return new ListPolicyOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListPolicyOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListPolicyOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ListPolicyOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected ListPolicyOptions() { }

  protected ListPolicyOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ListPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The starting position of the item in the list of items. For example, if you have three workspaces in your account,
   * the first workspace is assigned position number 0, the second workspace is assigned position number 1, and so
   * forth. If you have 6 workspaces and you want to list the details for workspaces `2-6`, enter 1. To limit the number
   * of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative numbers are not
   * supported and are ignored.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000. If no
   * value is provided, 100 is used by default.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }
}

