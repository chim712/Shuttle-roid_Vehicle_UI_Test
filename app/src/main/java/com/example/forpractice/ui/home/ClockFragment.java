package com.example.forpractice.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;

import androidx.fragment.app.Fragment;

import com.example.forpractice.R;

public class ClockFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.home_clock, container, false);

        //TextClock textClock = view.findViewById(R.id.clockText);

        return view;
    }
}
