package com.example.myapplication.interfaces;

import com.example.myapplication.ownmodal.Category;

import java.util.ArrayList;

public interface CategoryRequest {
    void onStart();
    void onEndt(String success, ArrayList<Category> categories);
}
