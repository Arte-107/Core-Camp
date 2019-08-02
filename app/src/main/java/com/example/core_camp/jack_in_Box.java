package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jack_in_Box extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jack_in__box);

        WebView sire = (WebView) findViewById(R.id.jack);
        sire.loadUrl("http://www.jackinthebox.com");
    }
}
