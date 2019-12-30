package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gasstation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasstation);
        CardView mahacard = findViewById(R.id.mahanagarpump);
        mahacard.setOnClickListener(this);
        CardView bharatcard = findViewById(R.id.bharartpet);
        bharatcard.setOnClickListener(this);
        CardView usmacard = findViewById(R.id.usmapet);
        usmacard.setOnClickListener(this);
        CardView Technocard = findViewById(R.id.Technopet);
        Technocard.setOnClickListener(this);
        CardView HPpetcard = findViewById(R.id.HPpet);
        HPpetcard.setOnClickListener(this);
        CardView bharatpetrcard = findViewById(R.id.Bharatpetroleum);
        bharatpetrcard.setOnClickListener(this);
        CardView ravipetcard = findViewById(R.id.Ravipet);
        ravipetcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.mahanagarpump) {
            i = new Intent(this, MahanagarCNGActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.bharartpet) {
            i = new Intent(this, BharatCNGActivity.class);
            startActivity(i);
        }

        if (view.getId() == R.id.usmapet) {
            i = new Intent(this, UsmaCNGActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.Technopet) {
            i = new Intent(this, TechnoPetActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.HPpet) {
            i = new Intent(this, HPPetrActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.Bharatpetroleum) {
            i = new Intent(this, BharatPetroleumActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.Ravipet) {
            i = new Intent(this, RaviPetroleumActivity.class);
            startActivity(i);
        }
    }
}
