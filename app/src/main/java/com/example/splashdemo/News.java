package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class News extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

    }

    public void hinudstan(View view) {
        Intent intent = new Intent(News.this, HindustanTimes.class);
        startActivity(intent);

    }

    public void midday(View view) {
        Intent intent = new Intent(News.this, MiddayActivity.class);
        startActivity(intent);
    }

    public void times(View view) {
        Intent intent = new Intent(News.this, TimesIndiaActivity.class);
        startActivity(intent);
    }

    public void raftar(View view) {
        Intent intent = new Intent(News.this, RaftaarActivity.class);
        startActivity(intent);
    }

    public void lokmat(View view) {
        Intent intent = new Intent(News.this, LokmatActivity.class);
        startActivity(intent);
    }

    public void ndtv(View view) {
        Intent intent = new Intent(News.this, NdtvActivity.class);
        startActivity(intent);
    }
}



