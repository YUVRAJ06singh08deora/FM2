package com.example.fm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class scheduleTimer extends AppCompatActivity {
    FirebaseDatabase rootnode;

    // creating a variable for our Database
    // Reference for Firebase.
    DatabaseReference refrence1,refrence2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_timer);
    }
}