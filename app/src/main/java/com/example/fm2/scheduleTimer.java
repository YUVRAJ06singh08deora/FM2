package com.example.fm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class scheduleTimer extends AppCompatActivity {
    Button setTime;
    FirebaseDatabase rootnode;

    // creating a variable for our Database
    // Reference for Firebase.

    DatabaseReference refrence1,refrence2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_timer);
        setTime = (Button) findViewById(R.id.setTime);
        setTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText date = (EditText)findViewById(R.id.date);
                String date1= date .getText().toString();
                EditText timer= (EditText)findViewById(R.id.timer);
                String timer1= timer.getText().toString();
                int timer2=Integer.parseInt(timer1);
                rootnode=FirebaseDatabase.getInstance();
                refrence1=rootnode.getReference("ScheduleTimer/Date");
                refrence1.setValue(date1);
                refrence2=rootnode.getReference("ScheduleTimer/ScheduleTime");
                refrence2.setValue(timer2);
            }
        });

    }
}