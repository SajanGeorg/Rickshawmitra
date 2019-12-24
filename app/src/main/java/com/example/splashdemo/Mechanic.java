package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mechanic extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic);
        CardView dilipcard = findViewById(R.id.dilip);
        dilipcard.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.dilip) {
            i = new Intent(this, DileepActivity.class);
            startActivity(i);
        }
    }
}
