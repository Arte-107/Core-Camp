package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnMove = findViewById(R.id.BtnActivityOne)

        BtnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ) {

                moveToActivityLangauge();
            }
        });

        }
        private void moveToActivityLangauge(){

        Intent intent = new Intent(MainActivity.this, LangaugeActivity.class);
        startActivity(intent);
        }
    }


