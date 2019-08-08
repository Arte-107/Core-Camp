package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button cars = findViewById(R.id.k);
        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(view.getContext(), k.class);

                startActivity(intent);
            }
        });

        Button kars = findViewById(R.id.r);
        kars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), r.class);

                startActivity(intent);
            }
        });
		
        WebView pop = (WebView) findViewById(R.id.clu);
        pop.loadUrl("https://www.utrgv.edu/cstem/resources/student/student-organizations-at-utrgv/index.htm");
    }
}