package com.samux.musikapp.model;

/**
 * Created by Yonkishum on 5/1/2016.
 */
public class Tracks {

    private String title, artist, album, thumbnailUrl;

    public Tracks() {

    }

    public Tracks(String title, String artist, String album, String thumbnailUrl) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}
