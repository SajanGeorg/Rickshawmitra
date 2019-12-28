package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Garage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        CardView shaktigcard = findViewById(R.id.shaktigarage);
        shaktigcard.setOnClickListener(this);
        CardView jitugarcard = findViewById(R.id.jitugarage);
        jitugarcard.setOnClickListener(this);
        CardView rajugarcard = findViewById(R.id.rajugarage);
        rajugarcard.setOnClickListener(this);
        CardView sagargarcard = findViewById(R.id.Sagargarage);
        sagargarcard.setOnClickListener(this);
        CardView ashokgarcard = findViewById(R.id.askokgarage);
        ashokgarcard.setOnClickListener(this);
        CardView pandgarcard = findViewById(R.id.pandgarage);
        pandgarcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.shaktigarage) {
            i = new Intent(this, ShaktiGarageActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.jitugarage) {
            i = new Intent(this, JituGarageActivity .class);
            startActivity(i);
        }

        if (view.getId() == R.id.rajugarage) {
            i = new Intent(this, RajuGarageActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.Sagargarage) {
            i = new Intent(this, SagarGarageActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.askokgarage) {
            i = new Intent(this, AshokGarageActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.pandgarage) {
            i = new Intent(this, PandTGarageActivity.class);
            startActivity(i);
        }

    }
}
