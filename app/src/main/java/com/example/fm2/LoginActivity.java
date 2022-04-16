package com.example.fm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeActivity();
            }
        });


    }
    public void homeActivity(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    }
