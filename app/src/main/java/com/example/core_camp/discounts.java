package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class discounts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discounts);

        Button tan=findViewById(R.id.Whataburger);
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), whataburger.class);
                startActivity(intent);

            }
        });

        Button bo=findViewById(R.id.wings);
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), wingstop.class);
                startActivity(intent);

            }
        });

        Button bae=findViewById(R.id.Burgerking);
        bae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), burgerking.class);
                startActivity(intent);
            }
        });

        Button bore=findViewById(R.id.subway);
        bore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), subway.class);
                startActivity(intent);

            }
        });

        Button los=findViewById(R.id.Pizzahut);
        los.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), pizzahut.class);
                startActivity(intent);

            }
        });

        Button las=findViewById(R.id.mcdolands);
        las.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), mcdonalds.class);
                startActivity(intent);

            }
        });

        Button lop=findViewById(R.id.jack);
        lop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), jack_in_Box.class);
                startActivity(intent);

            }
        });



    }
}
