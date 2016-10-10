/*
 * PersonalCloudStorageAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/10/2016
 */
package com.verizon.cloudapi.api.models;

import java.util.*;

public class PlaylistItemBuilder {
    //the instance to build
    private PlaylistItem playlistItem;

    /**
     * Default constructor to initialize the instance
     */
    public PlaylistItemBuilder() {
        playlistItem = new PlaylistItem();
    }

    /**
     * Name of the file
     */
    public PlaylistItemBuilder filename(String filename) {
        playlistItem.setFilename(filename);
        return this;
    }

    /**
     * Path of the file
     */
    public PlaylistItemBuilder path(String path) {
        playlistItem.setPath(path);
        return this;
    }

    /**
     * Type of content
     */
    public PlaylistItemBuilder mimeType(String mimeType) {
        playlistItem.setMimeType(mimeType);
        return this;
    }

    /**
     * Size of the item
     */
    public PlaylistItemBuilder size(int size) {
        playlistItem.setSize(size);
        return this;
    }

    /**
     * Timestamp of version created date
     */
    public PlaylistItemBuilder versionCreated(String versionCreated) {
        playlistItem.setVersionCreated(versionCreated);
        return this;
    }

    public PlaylistItemBuilder fileAttribute(PlaylistItem fileAttribute) {
        playlistItem.setFileAttribute(fileAttribute);
        return this;
    }

    /**
     * Unique token for content
     */
    public PlaylistItemBuilder contentToken(String contentToken) {
        playlistItem.setContentToken(contentToken);
        return this;
    }

    /**
     * Checksum detail
     */
    public PlaylistItemBuilder checksum(String checksum) {
        playlistItem.setChecksum(checksum);
        return this;
    }

    /**
     * Show accessibility of the content
     */
    public PlaylistItemBuilder contentAccessible(boolean contentAccessible) {
        playlistItem.setContentAccessible(contentAccessible);
        return this;
    }

    /**
     * File extension
     */
    public PlaylistItemBuilder extension(String extension) {
        playlistItem.setExtension(extension);
        return this;
    }

    public PlaylistItemBuilder tags(Object tags) {
        playlistItem.setTags(tags);
        return this;
    }

    /**
     * Unique identifier of the resource
     */
    public PlaylistItemBuilder uri(String uri) {
        playlistItem.setUri(uri);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PlaylistItem build() {
        return playlistItem;
    }
}