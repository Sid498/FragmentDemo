package com.example.sidpawar.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sidpawar on 05-03-2018.
 */

public class FragmentB extends Fragment {
    TextView tv;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //tv = view.findViewById(R.id.textview_b);
        tv = getActivity().findViewById(R.id.textview_b);
        Toast.makeText(getActivity(), "Fragment B", Toast.LENGTH_SHORT).show();
    }

    public void changeText(String data){
        tv.setText(data+"");
    }
}
