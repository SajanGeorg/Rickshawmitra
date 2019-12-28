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
        CardView shakticard = findViewById(R.id.shaktimech);
        shakticard.setOnClickListener(this);
        CardView jitucard = findViewById(R.id.jitumech);
        jitucard.setOnClickListener(this);
        CardView sagarcard = findViewById(R.id.Sagarmech);
        sagarcard.setOnClickListener(this);
        CardView dombmechcard = findViewById(R.id.dombivlimech);
        dombmechcard.setOnClickListener(this);
        CardView pandmechcard = findViewById(R.id.pandtmech);
        pandmechcard.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.dilip) {
            i = new Intent(this, DileepActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.shaktimech) {
            i = new Intent(this, ShaktiMechActivity.class);
            startActivity(i);
        }

        if (view.getId() == R.id.jitumech) {
            i = new Intent(this, JituMechActivity.class);
            startActivity(i);
        }
          if (view.getId() == R.id.Sagarmech) {
            i = new Intent(this, SagarMechActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.dombivlimech) {
            i = new Intent(this, DombMechActivity.class);
            startActivity(i);
        }
        if (view.getId() == R.id.pandtmech) {
            i = new Intent(this, PandTMechMechActivity.class);
            startActivity(i);
        }

    }
}
