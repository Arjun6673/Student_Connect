package com.arjunmore.studentconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView btnAbout,btnCources,btnAccreditation,btnAwards,
            btnLifeOfCampus,btnPlacement,btnAdmission,
            btnLocation,btnDirectory,btnContactus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout = findViewById(R.id.btnAboutUs);
        btnCources = findViewById(R.id.btnCources);
        btnDirectory = findViewById(R.id.btnDirectory);
        btnContactus = findViewById(R.id.btnContactUs);
        btnAccreditation = findViewById(R.id.btnAccreditation);
        btnAwards = findViewById(R.id.btnAwards);
        btnLifeOfCampus = findViewById(R.id.btnLifeOfcampus);
        btnPlacement = findViewById(R.id.btnPlacement);
        btnAdmission = findViewById(R.id.btnAdmission);
        btnLocation = findViewById(R.id.btnLocation);


       btnAbout.setOnClickListener(this);
       btnCources.setOnClickListener(this);
        btnContactus.setOnClickListener(this);
       btnDirectory.setOnClickListener(this);
       btnAccreditation.setOnClickListener(this);
       btnAwards.setOnClickListener(this);
       btnLifeOfCampus.setOnClickListener(this);
       btnPlacement.setOnClickListener(this);
       btnAdmission.setOnClickListener(this);
       btnLocation.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAboutUs:
                Open(1);
                break;

            case R.id.btnCources:
                Open(2);
                break;

            case R.id.btnAccreditation:
                Open(3);
                break;

            case R.id.btnAwards:
                Open(4);
                break;

            case R.id.btnLifeOfcampus:
                Open(5);
                break;
            case R.id.btnPlacement:
                Open(6);
                break;
            case R.id.btnAdmission:
                Open(7);
                break;
            case R.id.btnLocation:
                Open(8);
                break;
            case R.id.btnDirectory:
                Open(9);
                break;
            case R.id.btnContactUs:
                Open(10);
                break;
        }
    }

    private void Open(int i) {
        Intent intent = new Intent(MainActivity.this,Container.class);
        intent.putExtra("frag",i+"");
        startActivity(intent);
    }
}
