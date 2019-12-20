package com.example.daktari;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class GenralTopics extends AppCompatActivity {
    Button persistentdepression,postpartum,bipolar,riskfactors,learnmore;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genral_topics);
        persistentdepression=findViewById(R.id.persistentdepression);
        postpartum=findViewById(R.id.postpartum);
        bipolar=findViewById(R.id.bipolarg);
        riskfactors=findViewById(R.id.riskfactors);
        learnmore=findViewById(R.id.learnmore);
        webView=findViewById(R.id.webview);

        webView.setWebViewClient(new myBrowser());

        persistentdepression.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://themighty.com/2016/06/what-its-like-to-live-with-dysthymia-persistent-depressive-disorder/";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });

        postpartum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.helpguide.org/articles/depression/postpartum-depression-and-the-baby-blues.html/";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });

        bipolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.google.com/amp/s/www.medicalnewstoday.com/articles/amp/319136";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });

        riskfactors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.webmd.com//depression/guide/depression-are-you-at-risk";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });
        

        learnmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://www.webmd.com/depression/guide/depression-symptoms-and-types";
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });
    }
    private class myBrowser extends WebViewClient{
        @SuppressLint("NewApi")
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }
}
