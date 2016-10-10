/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PlaylistAddRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5159666211593058243L;
    private List<String> add;
    /** GETTER
     * An array of paths to items.
     */
    @JsonGetter("add")
    public List<String> getAdd ( ) { 
        return this.add;
    }
    
    /** SETTER
     * An array of paths to items.
     */
    @JsonSetter("add")
    public void setAdd (List<String> value) { 
        this.add = value;
    }
 
}
 