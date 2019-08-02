package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class wingstop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wingstop);

        WebView browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("http://www.wingstop.com");

    }
}
