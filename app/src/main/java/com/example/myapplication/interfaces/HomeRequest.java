package com.example.myapplication.interfaces;

import java.util.ArrayList;

import com.example.myapplication.ownmodal.Album;
import com.example.myapplication.ownmodal.Artist;
import com.example.myapplication.ownmodal.Category;
import com.example.myapplication.ownmodal.ItemSong;


public interface HomeRequest {
    void onStart();
    void onEnd(String success, ArrayList<Category> categories, ArrayList<Album> albums, ArrayList<Artist> artists, ArrayList<ItemSong> itemSongs);
}
