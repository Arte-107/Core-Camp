package com.example.core_camp;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Acttwo extends AppCompatActivity {

    public Button butl;

    public void init (){
        butl= (Button)findViewById(R.id.butl);
        butl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy = new Intent(first.this,second.class);


            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acttwo);
        init();
    }
}
