package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HOMEActivity<button> extends AppCompatActivity {

    private button gtsm;
    private Object HOMEActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HOMEActivity = findViewById(R.id.gtsm);
        ((View) HOMEActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        HOMEActivity = findViewById(R.id.mbdis);
        ((View) HOMEActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), accountsActivity.class);
                startActivity(intent);
            }
        });
    }
}
