package com.example.sidpawar.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Communication{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragment_b);
        fragmentB.changeText(data+"");
    }
}
