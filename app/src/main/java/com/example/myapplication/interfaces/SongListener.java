package com.example.myapplication.interfaces;

import com.example.myapplication.ownmodal.ItemSong;

import java.util.ArrayList;

public interface SongListener {
    void onStart();
    void onEnd(String success, ArrayList<ItemSong> arrayList);

}
