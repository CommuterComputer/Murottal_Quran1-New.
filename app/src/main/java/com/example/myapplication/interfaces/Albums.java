package com.example.myapplication.interfaces;

import com.example.myapplication.ownmodal.Album;

import java.util.ArrayList;

public interface Albums {
    void onStart();
    void onEnd(ArrayList<Album> albums);
}
