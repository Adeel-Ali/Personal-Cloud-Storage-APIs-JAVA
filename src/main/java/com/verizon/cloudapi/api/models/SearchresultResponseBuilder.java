/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;

public class SearchresultResponseBuilder {
    //the instance to build
    private SearchresultResponse searchresultResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SearchresultResponseBuilder() {
        searchresultResponse = new SearchresultResponse();
    }

    /**
     * Total number of search matches
     */
    public SearchresultResponseBuilder count(long count) {
        searchresultResponse.setCount(count);
        return this;
    }

    public SearchresultResponseBuilder file(List<FileMetadata> file) {
        searchresultResponse.setFile(file);
        return this;
    }

    public SearchresultResponseBuilder folder(List<FolderMetadata> folder) {
        searchresultResponse.setFolder(folder);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SearchresultResponse build() {
        return searchresultResponse;
    }
}