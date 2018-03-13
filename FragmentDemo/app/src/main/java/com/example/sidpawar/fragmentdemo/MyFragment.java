package com.example.sidpawar.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by sidpawar on 04-03-2018.
 */

public class MyFragment extends Fragment implements View.OnClickListener{
    Button btnClick;
    int mCount=0;
    Communication com;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (Communication) getActivity();
        btnClick = getActivity().findViewById(R.id.btnClick);
        btnClick.setOnClickListener(this);
        Toast.makeText(getActivity(), "on activity", Toast.LENGTH_SHORT).show();
        Log.d("Tag","unt");
    }

    @Override
    public void onClick(View view) {
        mCount++;
        Log.d("Tag","mCount");
         com.respond("The count is"+mCount);
        Toast.makeText(getActivity(), "called", Toast.LENGTH_SHORT).show();
    }

}
