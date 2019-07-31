package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button languageActivity;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button button=findViewById(R.id.BtnActivityOne);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(view.getContext(),languageActivity.class);
                    startActivity(intent);
                }
            });
        }
        
        
        
        private Button accountsActivity;
        
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setConetentView(R.layout.activity_main);
            
            Button button=findViewById(R.id.accountb123);
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(view.getContext(),accountsActivity.class);
                    startActivity(intent);
                }
            });
        }

    private void setConetentView(int activity_main) {
    }

}


