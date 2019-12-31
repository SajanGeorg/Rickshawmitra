package com.example.splashdemo;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class TimesIndiaActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindustan_times);
        webView = findViewById(R.id.ht);
        webView.setWebViewClient(new MyWebViewClient()); /* Inorder to view web within app and no need to open another web when we click
                                                              on anylink in web*/
        String url = "https://m.timesofindia.com/topic/DOMBIVLI/";
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
