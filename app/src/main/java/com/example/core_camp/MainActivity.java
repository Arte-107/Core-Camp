package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnMove;
    private Button languageActivity;
    private Button noteAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageActivity = findViewById(R.id.BtnActivityOne);
        languageActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), languageActivity.class);
                startActivity(intent);
            }
        });

        BtnMove = findViewById(R.id.accountb123);
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), accountsActivity.class);
                startActivity(intent);
            }
        });


        noteAct = findViewById(R.id.noteAct);
        noteAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), notificationsActivity.class);
                startActivity(intent);


            }
        });
    }
}


