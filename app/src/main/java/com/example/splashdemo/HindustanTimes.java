package com.example.splashdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HindustanTimes extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindustan_times);
        webView=findViewById(R.id.ht);
        webView.setWebViewClient(new MyWebViewClient());
        String url="https://www.hindustantimes.com/topic/dombivli/";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }

    public static class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;

        }
    }


}
