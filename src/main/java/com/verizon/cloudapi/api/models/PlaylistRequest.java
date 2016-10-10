/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PlaylistRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4939822866064487979L;
    private String name;
    private List<String> paths;
    private String type;
    /** GETTER
     * Name of the playlist.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of the playlist.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * An array of paths to items.
     */
    @JsonGetter("paths")
    public List<String> getPaths ( ) { 
        return this.paths;
    }
    
    /** SETTER
     * An array of paths to items.
     */
    @JsonSetter("paths")
    public void setPaths (List<String> value) { 
        this.paths = value;
    }
 
    /** GETTER
     * The type of the playlist. Can be one of 'image', 'music', 'video' or 'image-video'
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of the playlist. Can be one of 'image', 'music', 'video' or 'image-video'
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 