package com.example.fm2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class home extends AppCompatActivity {
    Button scheduleTime,prviousData,onOrOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        scheduleTime=(Button) findViewById(R.id.scheduleTime);
        prviousData=(Button) findViewById(R.id.previousData);
        onOrOff=(Button) findViewById(R.id.onOrOff);
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
}