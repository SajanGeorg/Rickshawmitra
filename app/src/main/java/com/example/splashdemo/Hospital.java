package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hospital extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        CardView rrhospital = findViewById(R.id.rrhosp);
        rrhospital.setOnClickListener(this);
        CardView aimshosp = findViewById(R.id.aims);
        aimshosp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.rrhosp) {
            i = new Intent(this,RRHospitalActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.aims) {
            i = new Intent(this,AimsHospitalActivity.class);
            startActivity(i);
        }
    }
}
