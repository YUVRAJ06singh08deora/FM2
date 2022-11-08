package com.example.fm2;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Switch;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class onOrOffActivity extends AppCompatActivity {
    // creating a variable for our
// Firebase Database.
    FirebaseDatabase rootnode;

    // creating a variable for our Database
    // Reference for Firebase.
    DatabaseReference refrence1,refrence2,ref1servo,ref2servo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_or_off);
        Switch sw = (Switch) findViewById(R.id.onOffSwitch);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    System.out.println("Button is turned on");
                       int servoOnStatus=110;
                       int servoOffStatus=90;
                    Date date = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                    String dat1 = formatter.format(date);
                    rootnode=FirebaseDatabase.getInstance();
                    ref1servo=rootnode.getReference("servo2value");
                    ref1servo.setValue(servoOnStatus);
                    ref2servo=rootnode.getReference("servo1value");
                    ref2servo.setValue(servoOffStatus);
                    refrence2=rootnode.getReference("btnStatus/date");
                    refrence2.setValue(dat1);

                } else {
                    System.out.println("Button is turned off"); // The toggle is disabled
                    Date date = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                    String dat1 = formatter.format(date);
                    int servoOnstatus=130;
                    int servoOffstatus=0;
                    rootnode=FirebaseDatabase.getInstance();
                    ref1servo=rootnode.getReference("servo2value");
                    ref1servo.setValue(servoOnstatus);
                    ref2servo=rootnode.getReference("servo1value");
                    ref2servo.setValue(servoOffstatus);
                    refrence2=rootnode.getReference("btnStatus/date");
                    refrence2.setValue(dat1);

                }
            }
        });
    }



}