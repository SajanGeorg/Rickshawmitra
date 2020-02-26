package com.example.splashdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.splashdemo.payment.AmazonpayActivity;
import com.example.splashdemo.payment.FreechargeActivity;
import com.example.splashdemo.payment.GooglepayActivity;
import com.example.splashdemo.payment.InstamojoActivity;
import com.example.splashdemo.payment.PaypalActivity;
import com.example.splashdemo.payment.PaytmActivity;

public class Payment extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        CardView paytmcard = findViewById(R.id.paytm);
        CardView amazonCard = findViewById(R.id.amazonpay);
        CardView googlepaycard = findViewById(R.id.googlepay);
        CardView freechargecard = findViewById(R.id.freecharge);
        CardView paypalcard = findViewById(R.id.paypal);
        CardView instamojocard = findViewById(R.id.instamojos);
        paytmcard.setOnClickListener(this);
        amazonCard.setOnClickListener(this);
        googlepaycard.setOnClickListener(this);
        freechargecard.setOnClickListener(this);
        paypalcard.setOnClickListener(this);
        instamojocard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.paytm:
                i = new Intent(this, PaytmActivity.class);
                startActivity(i);
                break;
            case R.id.amazonpay:
                i = new Intent(this, AmazonpayActivity.class);
                startActivity(i);
                break;
            case R.id.googlepay:
                i = new Intent(this, GooglepayActivity.class);
                startActivity(i);
                break;
            case R.id.freecharge:
                i = new Intent(this, FreechargeActivity.class);
                startActivity(i);
                break;
            case R.id.paypal:
                i = new Intent(this, PaypalActivity.class);
                startActivity(i);
                break;
            case R.id.instamojos:
                i = new Intent(this, InstamojoActivity.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}



