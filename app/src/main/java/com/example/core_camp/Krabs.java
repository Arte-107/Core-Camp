package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Krabs extends AppCompatActivity {
    private Button button30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krabs);
        button30= findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openree();
            }
        });
    }
    public void openree(){
        Intent intent = new Intent(this,ree.class);
        startActivity(intent);
    }
}
