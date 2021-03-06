package com.pvobrien.songr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {

    @Id // this is the id SERIAL PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToMany(mappedBy = "album",cascade = CascadeType.ALL, orphanRemoval = true)

    public List<Song> tracks = new ArrayList<>();

    private String title;
    private String artist;
    private int songCount;
    private Integer length;
    private String imageUrl;

    public Album(String title, String artist,  int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Album(){}

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

    public int getSongCount() {
        return songCount;
    }
    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public List<Song> getTracks() {return tracks;}
    public void setTracks(List<Song> tracks) {
        this.tracks = tracks;
    }
}