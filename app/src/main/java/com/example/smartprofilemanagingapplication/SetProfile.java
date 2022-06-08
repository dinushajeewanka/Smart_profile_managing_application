package com.example.smartprofilemanagingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;

public class SetProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_profile);


        MaterialButton Addlocation1 = findViewById(R.id.setbtn1);
        MaterialButton Addlocation2 = findViewById(R.id.setbtn2);
        MaterialButton Addlocation3 = findViewById(R.id.setbtn3);
        MaterialButton Addlocation4 = findViewById(R.id.setbtn4);
        MaterialButton Addlocation5 = findViewById(R.id.setbtn5);
        MaterialButton Addlocation6 = findViewById(R.id.setbtn6);

        Addlocation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(SetProfile.this,SetProfileLocation.class));
            }
        });

        Addlocation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(SetProfile.this,SetProfileLocation.class));
            }
        });

        Addlocation3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(SetProfile.this,SetProfileLocation.class));
            }
        });

        Addlocation4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(SetProfile.this,SetProfileLocation.class));
            }
        });

        Addlocation5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(SetProfile.this,SetProfileLocation.class));
            }
        });

        Addlocation6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(SetProfile.this,SetProfileLocation.class));
            }
        });
    }
}