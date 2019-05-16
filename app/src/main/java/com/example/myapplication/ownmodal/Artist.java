package com.example.myapplication.ownmodal;

import java.io.Serializable;

public class Artist implements Serializable {

    private String id;
    private String nama;
    private String image;
    private String thumb;

    public Artist(String id, String nama, String image, String thumb) {
        this.id = id;
        this.nama = nama;
        this.image = image;
        this.thumb = thumb;
    }

    public String getId() {
    return id;
    }

    public String getNama() {
        return nama;
    }

    public String getImage() {
        return image;
    }

    public String getThumb() {
        return thumb;
    }
}

