package com.example.forpractice;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentManager;

import com.example.forpractice.ui.home.BusstopFragment;
import com.example.forpractice.ui.home.ClockFragment;
import com.example.forpractice.ui.home.NaviBarFragment;
import com.example.forpractice.ui.home.RouteFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        busstopFragment = new BusstopFragment();
        clockFragment = new ClockFragment();
        routeFragment = new RouteFragment();
        naviBarFragment = new NaviBarFragment();

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_clock, clockFragment)
                .replace(R.id.fragment_routeinfo, routeFragment)
                .replace(R.id.fragment_stopinfo, busstopFragment)
                .replace(R.id.fragment_navigation_bar, naviBarFragment)
                .commitNow();
    }


    // Fragments
    BusstopFragment busstopFragment;
    ClockFragment clockFragment;
    RouteFragment routeFragment;
    NaviBarFragment naviBarFragment;
}