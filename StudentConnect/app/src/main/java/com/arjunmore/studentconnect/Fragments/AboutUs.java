package com.arjunmore.studentconnect.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arjunmore.studentconnect.R;


public class AboutUs extends Fragment {

    public AboutUs() {}



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_about_us, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

    }
}
