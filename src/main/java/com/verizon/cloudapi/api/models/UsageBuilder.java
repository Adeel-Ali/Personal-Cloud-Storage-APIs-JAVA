/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;

public class UsageBuilder {
    //the instance to build
    private Usage usage;

    /**
     * Default constructor to initialize the instance
     */
    public UsageBuilder() {
        usage = new Usage();
    }

    /**
     * Total quota space available to the user on the cloud in bytes
     */
    public UsageBuilder quota(long quota) {
        usage.setQuota(quota);
        return this;
    }

    /**
     * Total quota space used in bytes
     */
    public UsageBuilder quotaUsed(long quotaUsed) {
        usage.setQuotaUsed(quotaUsed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Usage build() {
        return usage;
    }
}