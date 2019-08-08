package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class r extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);
        WebView r = (WebView) findViewById(R.id.r);
        r.loadUrl("https://www.utrgv.edu/cstem/resources/student/student-organizations-at-utrgv/index.htm");
    }
}
