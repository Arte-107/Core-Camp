package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        WebView ah = (WebView) findViewById(R.id.map);
        ah.loadUrl("http://www.googlemaps.com");
    }
}
