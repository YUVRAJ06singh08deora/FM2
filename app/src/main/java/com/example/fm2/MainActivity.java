package com.example.fm2;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button login,scheduleTime,prviousData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        scheduleTime=(Button) findViewById(R.id.scheduleTime);
        prviousData=(Button) findViewById(R.id.previousData);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeActivity();
            }
        });
        scheduleTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scheduleTimeActivity();
            }
        });
        prviousData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousData();
            }
        });

    }
    public void homeActivity(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void scheduleTimeActivity(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void previousData(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    }
