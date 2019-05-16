package com.example.myapplication.tampilan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.luseen.spacenavigation.SpaceNavigationView;

import java.util.EventListener;

import com.example.myapplication.apis.Constant;
import com.example.myapplication.fragment.FragmentHome;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends ActivityBase implements NavigationView.OnNavigationItemSelectedListener, EventListener {

    private SpaceNavigationView space;
    private FrameLayout fragment_base;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout layout = (FrameLayout) findViewById(R.id.fragment_base);
        getLayoutInflater().inflate(R.layout.content_main, layout);

        Constant.isAppOpen = true;

        loadFragment();
    }

    private void loadFragment(){
        FragmentHome home = new FragmentHome();
        showLoadFragment(home);
    }

    private void showLoadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_base, fragment);
        transaction.commit();
    }

    @Override
    protected void onDestroy() {
        Constant.isAppOpen = false;
        if (PlayerService.exoPlayer != null && !PlayerService.exoPlayer.getPlayWhenReady()){
            Intent intent = new Intent(getApplicationContext(), PlayerService.class);
            intent.setAction(PlayerService.ACTION_STOP);
            startService(intent);
        }
        super.onDestroy();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}