package com.example.fm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class onOrOffActivity extends AppCompatActivity {
    ImageButton onButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_or_off);
        onButton=(ImageButton) findViewById(R.id.onOff);
        onButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onActivity();
            }
        });
    }
    public void onActivity(){
        Intent intent = new Intent(this, onactivity.class);
        startActivity(intent);
    }
}