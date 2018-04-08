package com.arjunmore.studentconnect;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arjunmore.studentconnect.Fragments.AboutUs;
import com.arjunmore.studentconnect.Fragments.Cources;

public class Container extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        Intent intent = getIntent();
        String one = intent.getStringExtra("one");
        Bundle bundle = new Bundle();
        bundle.putString("one",one);

        Cources cources = new Cources();
        cources.setArguments(bundle);
        FragmentManager fr = getFragmentManager();
        FragmentTransaction ft = fr.beginTransaction();
        ft.replace(R.id.Container,cources,"done").commit();
    }
}
