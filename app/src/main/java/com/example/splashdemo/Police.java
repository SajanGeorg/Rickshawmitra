package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Police extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
        CardView thakcard = findViewById(R.id.thakpolice);
        thakcard.setOnClickListener(this);
        CardView thakpolcard = findViewById(R.id.thakpoilcestation);
        thakpolcard.setOnClickListener(this);
        CardView manpadacard = findViewById(R.id.manpadapolice);
        manpadacard.setOnClickListener(this);
        CardView rtocard = findViewById(R.id.RTODomb);
        rtocard.setOnClickListener(this);
        CardView traffichcard = findViewById(R.id.trafficchowk);
        traffichcard.setOnClickListener(this);
        CardView rtokalcard = findViewById(R.id.rtokalyan);
        rtokalcard.setOnClickListener(this);
        CardView deptrtocard = findViewById(R.id.deputykalyan);
        deptrtocard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.thakpolice) {
            i = new Intent(this,ThakurliOutpoliceActivity.class);
            startActivity(i);
        }
       if (view.getId() == R.id.thakpoilcestation) {
            i = new Intent(this, ThakurliPoliceActivity.class);
            startActivity(i);
        }

         if (view.getId() == R.id.manpadapolice) {
            i = new Intent(this, ManpadaPoliceActivity.class);
            startActivity(i);
        }
       if (view.getId() == R.id.RTODomb) {
            i = new Intent(this, RTODombActivity.class);
            startActivity(i);
        }
         if (view.getId() == R.id.trafficchowk) {
            i = new Intent(this, TrafficchowkActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.rtokalyan) {
            i = new Intent(this, RTOKalyanActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.deputykalyan) {
            i = new Intent(this, DeputyKalyanActivity.class);
            startActivity(i);
        }
    }
}
