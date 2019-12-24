package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashNav extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_nav);
        //defining card for our boys
        CardView mechanicCard = findViewById(R.id.mechnanic);
        CardView garageCard = findViewById(R.id.garage);
        CardView policeCard = findViewById(R.id.police);
        CardView hospitalCard = findViewById(R.id.hospital);
        CardView hotelCard = findViewById(R.id.hotel);
        CardView gasstationCard = findViewById(R.id.gasstation);
        mechanicCard.setOnClickListener(this);
        garageCard.setOnClickListener(this);
        gasstationCard.setOnClickListener(this);
        policeCard.setOnClickListener(this);
        hospitalCard.setOnClickListener(this);
        hotelCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.mechnanic : i= new Intent(this,Mechanic.class);startActivity(i);break;
            case R.id.garage :i=new Intent(this,Garage.class);startActivity(i);break;
            case R.id.gasstation :i=new Intent(this,Gasstation.class);startActivity(i);break;
            case R.id.police :i=new Intent(this,Police.class);startActivity(i);break;
            case R.id.hospital :i=new Intent(this,Hospital.class);startActivity(i);break;
            case R.id.hotel :i=new Intent(this,Hotel.class);startActivity(i);break;
            default: break;



        }
    }
}
