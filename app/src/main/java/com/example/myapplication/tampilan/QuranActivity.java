package com.example.myapplication.tampilan;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.example.myapplication.adapter.AdapterListSurat;
import com.example.myapplication.modal.ModalListSurat;

import java.util.List;

public class QuranActivity extends AppCompatActivity {

    int get;
    private RequestQueue queue;
    private GridLayoutManager gm;
    private List<ModalListSurat> suratList;
    private AdapterListSurat adapterListSurat;
    private RecyclerView recyclerView;
    TextView et_type, et_asma, et_ayat;
    String type, asma, ayat;
}
