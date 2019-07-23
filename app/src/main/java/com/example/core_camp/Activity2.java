package com.example.core_camp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class Activity3 extends AppCompatActivity {
    public class Activity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);


            protected void onCreate2(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_3);
            }
        }
    }
}