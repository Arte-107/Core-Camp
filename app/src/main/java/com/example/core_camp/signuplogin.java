package com.example.core_camp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signuplogin extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private EditText Info;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuplogin);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }

        });

    }

    private void validate(String userName, String userPassword) {

        if ((userName == "Admin") && (userPassword == "1234")) {
            Intent intent = new Intent(MainActivity.this, HOMEActivity.class);
            if ((userName == "abrielledavila27@gmail.com") && (userPassword == "1234")) {
                Intent intent = new Intent(signuplogin.this, HOMEActivity.class);
                startActivity(intent);
            }

        }

    }
}

    }
