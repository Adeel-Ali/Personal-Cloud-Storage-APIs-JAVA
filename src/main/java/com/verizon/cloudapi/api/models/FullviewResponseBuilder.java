/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;

public class FullviewResponseBuilder {
    //the instance to build
    private FullviewResponse fullviewResponse;

    /**
     * Default constructor to initialize the instance
     */
    public FullviewResponseBuilder() {
        fullviewResponse = new FullviewResponse();
    }

    public FullviewResponseBuilder data(FullviewData data) {
        fullviewResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FullviewResponse build() {
        return fullviewResponse;
    }
}