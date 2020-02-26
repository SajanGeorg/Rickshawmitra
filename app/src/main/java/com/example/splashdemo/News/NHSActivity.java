package com.example.splashdemo.News;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.splashdemo.R;

//import android.view.View;
//import android.webkit.WebChromeClient;
//import android.widget.ProgressBar;

public class NHSActivity extends AppCompatActivity {
    WebView webView;
        //ProgressBar mprogressBar;
        SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindustan_times);
       /* Inorder to view web within app and no need to open another web when we click
                                                              //on anylink in web*/
            swipe=findViewById(R.id.swipe);
            swipe.setOnRefreshListener(this::Loadweb);
            Loadweb();

//https://m.timesofindia.com/topic/DOMBIVLI/"
        //https://www.ndtv.com/topic/dombivli/"
        //https://m.mid-day.com/search/dombivli-all
        //
        //https://www.healthline.com/directory/news/
       // https://news.raftaar.in/tags/dombivli/
        //https://www.hindustantimes.com/topic/dombivli/
    }
            public  void Loadweb(){
                webView = findViewById(R.id.ht);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl( "https://www.nhp.gov.in");
                swipe.setRefreshing(true);

                //mprogressBar=findViewById(R.id.progressbar);
                WebSettings webSettings=webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient(){
                    @Override
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        /*mprogressBar.setVisibility(View.VISIBLE);//what happened to this shit ,why it's not diplaying ahhhhhhhhhhhhh*/
                        setTitle("Loading....");
                        super.onPageStarted(view, url, favicon);


                    }

                    @Override
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        //mprogressBar.setVisibility(View.GONE);
                        setTitle(view.getTitle());
                        swipe.setRefreshing(false);
                        super.onPageFinished(view, url);

                    }
                });
                }


    @Override
    public void onBackPressed() {
        if(webView.canGoBack())//to go back to previous page rather than back to activity
        {
            webView.goBack();
        }else {
            finish();
        }
    }
}
