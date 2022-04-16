package com.example.fm2;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
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


public class onOrOffActivity extends AppCompatActivity {
    // creating a variable for our
// Firebase Database.
    FirebaseDatabase firebaseDatabase;

    // creating a variable for our Database
    // Reference for Firebase.
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_or_off);
        Switch sw = (Switch) findViewById(R.id.onOffSwitch);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    System.out.println("Button is turned on");
                    int servo_onvalue=180;
                    databaseReference.setValue(servo_onvalue);
                } else {
                    System.out.println("Button is turned off"); // The toggle is disabled
                    int servo_offvalue=0;
                    databaseReference.setValue(servo_offvalue);
                }
            }
        });
    }

}