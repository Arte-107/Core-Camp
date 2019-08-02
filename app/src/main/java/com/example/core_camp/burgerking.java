package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class burgerking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgerking);

        WebView na = (WebView) findViewById(R.id.king);
        na.loadUrl("http://www.burgerking.com");
    }
}
