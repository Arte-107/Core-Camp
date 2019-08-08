package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cookies extends AppCompatActivity {
private Button button60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookies);
        button60= findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                opentee();
            }
        });
    }
    public void opentee(){
        Intent intent = new Intent(this,tee.class);
        startActivity(intent);
    }
}

