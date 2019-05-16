package com.example.myapplication.interfaces;

import com.example.myapplication.ownmodal.Artist;

import java.util.ArrayList;

public interface ArtistRequest {
    void onStart();
    void onEnd (ArrayList<Artist> artists);
}
