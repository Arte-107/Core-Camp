package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class whataburger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whataburger);

        WebView na = (WebView) findViewById(R.id.what);
        na.loadUrl("http://www.whataburger.com");
    }
}
