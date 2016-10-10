/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;

public class LinkResponseBuilder {
    //the instance to build
    private LinkResponse linkResponse;

    /**
     * Default constructor to initialize the instance
     */
    public LinkResponseBuilder() {
        linkResponse = new LinkResponse();
    }

    /**
     * The link identifier.
     */
    public LinkResponseBuilder rel(String rel) {
        linkResponse.setRel(rel);
        return this;
    }

    /**
     * The URI of the link.
     */
    public LinkResponseBuilder link(String link) {
        linkResponse.setLink(link);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LinkResponse build() {
        return linkResponse;
    }
}