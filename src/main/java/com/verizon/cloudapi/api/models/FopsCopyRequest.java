/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FopsCopyRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5534161228873911047L;
    private String src;
    private String target;
    private boolean safe = false;
    private String conflictsolve;
    private String override;
    /** GETTER
     * Full path of the file/folder for copy/move/rename operations.
     */
    @JsonGetter("src")
    public String getSrc ( ) { 
        return this.src;
    }
    
    /** SETTER
     * Full path of the file/folder for copy/move/rename operations.
     */
    @JsonSetter("src")
    public void setSrc (String value) { 
        this.src = value;
    }
 
    /** GETTER
     * Full path of the target file/folder for copy/move/rename operations. In case of files the full/changed name should be included in the target.
     */
    @JsonGetter("target")
    public String getTarget ( ) { 
        return this.target;
    }
    
    /** SETTER
     * Full path of the target file/folder for copy/move/rename operations. In case of files the full/changed name should be included in the target.
     */
    @JsonSetter("target")
    public void setTarget (String value) { 
        this.target = value;
    }
 
    /** GETTER
     * If 'true', ensures that name conflicts are resolved according to the value of the 'conflictsolve' parameter. Defaults to 'false', in which case the operation will overwrite an existing file/folder of the same name.
     */
    @JsonGetter("safe")
    public boolean getSafe ( ) { 
        return this.safe;
    }
    
    /** SETTER
     * If 'true', ensures that name conflicts are resolved according to the value of the 'conflictsolve' parameter. Defaults to 'false', in which case the operation will overwrite an existing file/folder of the same name.
     */
    @JsonSetter("safe")
    public void setSafe (boolean value) { 
        this.safe = value;
    }
 
    /** GETTER
     * Defines how name conflicts are resolved, if the 'safe' parameter is set to 'true'. If set to 'copy', a new file is written to the destination folder with a non-conflicting name. If not set, the operation is rolled back and operation returns '409 Conflict'.
     */
    @JsonGetter("conflictsolve")
    public String getConflictsolve ( ) { 
        return this.conflictsolve;
    }
    
    /** SETTER
     * Defines how name conflicts are resolved, if the 'safe' parameter is set to 'true'. If set to 'copy', a new file is written to the destination folder with a non-conflicting name. If not set, the operation is rolled back and operation returns '409 Conflict'.
     */
    @JsonSetter("conflictsolve")
    public void setConflictsolve (String value) { 
        this.conflictsolve = value;
    }
 
    /** GETTER
     * Specifies what happens if a file of the same name exists at the target path and the 'safe' parameter is not set. Set to 'overwrite' to treat the copied file as completely new. Set to 'modify' to treat the new file as a modification of the old one. If the 'override' parameter is not set, the following algorithm is used: if the existing file has a 'deleted' attribute set to 'true', the file is overwritten; if the old file's 'deleted' attribute is false or not set, the file is modified.
     */
    @JsonGetter("override")
    public String getOverride ( ) { 
        return this.override;
    }
    
    /** SETTER
     * Specifies what happens if a file of the same name exists at the target path and the 'safe' parameter is not set. Set to 'overwrite' to treat the copied file as completely new. Set to 'modify' to treat the new file as a modification of the old one. If the 'override' parameter is not set, the following algorithm is used: if the existing file has a 'deleted' attribute set to 'true', the file is overwritten; if the old file's 'deleted' attribute is false or not set, the file is modified.
     */
    @JsonSetter("override")
    public void setOverride (String value) { 
        this.override = value;
    }
 
}
 