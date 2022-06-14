package com.example.smartprofilemanagingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        Addlocation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        Addlocation3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        Addlocation4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        Addlocation5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        Addlocation6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });
    }
}