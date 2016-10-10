/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateShareResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5744444609496804517L;
    private String name;
    private List<LinkResponse> links;
    private String uid;
    private Object owner;
    private Object sharer;
    private Integer totalResourceCount;
    private Integer expiresIn;
    private String expirationDate;
    private String creationDate;
    private String lastModifiedDate;
    private String inboundLastModifiedDate;
    private String publicInviteKey;
    private List<ResourceResponse> resources;
    /** GETTER
     * The name of the share.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the share.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("links")
    public List<LinkResponse> getLinks ( ) { 
        return this.links;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("links")
    public void setLinks (List<LinkResponse> value) { 
        this.links = value;
    }
 
    /** GETTER
     * The resource identifier.
     */
    @JsonGetter("uid")
    public String getUid ( ) { 
        return this.uid;
    }
    
    /** SETTER
     * The resource identifier.
     */
    @JsonSetter("uid")
    public void setUid (String value) { 
        this.uid = value;
    }
 
    /** GETTER
     * The owner of the share
     */
    @JsonGetter("owner")
    public Object getOwner ( ) { 
        return this.owner;
    }
    
    /** SETTER
     * The owner of the share
     */
    @JsonSetter("owner")
    public void setOwner (Object value) { 
        this.owner = value;
    }
 
    /** GETTER
     * The sharer of the share
     */
    @JsonGetter("sharer")
    public Object getSharer ( ) { 
        return this.sharer;
    }
    
    /** SETTER
     * The sharer of the share
     */
    @JsonSetter("sharer")
    public void setSharer (Object value) { 
        this.sharer = value;
    }
 
    /** GETTER
     * The total count of shared resources.
     */
    @JsonGetter("totalResourceCount")
    public Integer getTotalResourceCount ( ) { 
        return this.totalResourceCount;
    }
    
    /** SETTER
     * The total count of shared resources.
     */
    @JsonSetter("totalResourceCount")
    public void setTotalResourceCount (Integer value) { 
        this.totalResourceCount = value;
    }
 
    /** GETTER
     * The time to live of the share in seconds.
     */
    @JsonGetter("expiresIn")
    public Integer getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * The time to live of the share in seconds.
     */
    @JsonSetter("expiresIn")
    public void setExpiresIn (Integer value) { 
        this.expiresIn = value;
    }
 
    /** GETTER
     * Expiration date on the share.
     */
    @JsonGetter("expirationDate")
    public String getExpirationDate ( ) { 
        return this.expirationDate;
    }
    
    /** SETTER
     * Expiration date on the share.
     */
    @JsonSetter("expirationDate")
    public void setExpirationDate (String value) { 
        this.expirationDate = value;
    }
 
    /** GETTER
     * The date and time the share was created.
     */
    @JsonGetter("creationDate")
    public String getCreationDate ( ) { 
        return this.creationDate;
    }
    
    /** SETTER
     * The date and time the share was created.
     */
    @JsonSetter("creationDate")
    public void setCreationDate (String value) { 
        this.creationDate = value;
    }
 
    /** GETTER
     * The date and time the share was last modified from the perspective of the owner.
     */
    @JsonGetter("lastModifiedDate")
    public String getLastModifiedDate ( ) { 
        return this.lastModifiedDate;
    }
    
    /** SETTER
     * The date and time the share was last modified from the perspective of the owner.
     */
    @JsonSetter("lastModifiedDate")
    public void setLastModifiedDate (String value) { 
        this.lastModifiedDate = value;
    }
 
    /** GETTER
     * The date and time the share was last modified from the perspective of a member.
     */
    @JsonGetter("inboundLastModifiedDate")
    public String getInboundLastModifiedDate ( ) { 
        return this.inboundLastModifiedDate;
    }
    
    /** SETTER
     * The date and time the share was last modified from the perspective of a member.
     */
    @JsonSetter("inboundLastModifiedDate")
    public void setInboundLastModifiedDate (String value) { 
        this.inboundLastModifiedDate = value;
    }
 
    /** GETTER
     * The invite key of a public share.
     */
    @JsonGetter("publicInviteKey")
    public String getPublicInviteKey ( ) { 
        return this.publicInviteKey;
    }
    
    /** SETTER
     * The invite key of a public share.
     */
    @JsonSetter("publicInviteKey")
    public void setPublicInviteKey (String value) { 
        this.publicInviteKey = value;
    }
 
    /** GETTER
     * Array of resources
     */
    @JsonGetter("resources")
    public List<ResourceResponse> getResources ( ) { 
        return this.resources;
    }
    
    /** SETTER
     * Array of resources
     */
    @JsonSetter("resources")
    public void setResources (List<ResourceResponse> value) { 
        this.resources = value;
    }
 
}
 