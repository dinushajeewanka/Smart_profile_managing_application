package com.example.smartprofilemanagingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView ToDoimg = findViewById(R.id.ToDoList);
        TextView ToDoTxt = findViewById(R.id.ToDoList1);
        ImageView Profileimg = findViewById(R.id.profle_mode);
        TextView ProfileTxt = findViewById(R.id.profileMode);
        ImageView GoogleCimg = findViewById(R.id.google_calender);
        TextView GoogleCTxt = findViewById(R.id.googleT);
        ImageView Childimg = findViewById(R.id.childProtection);
        TextView childTxt = findViewById(R.id.childProtection1);
        TextView profileIcon = findViewById(R.id.userIcon);
        ImageView BackIcon = findViewById(R.id.imageBack);

        ToDoimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });


        ToDoTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        Profileimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        ProfileTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        GoogleCimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        GoogleCTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        Childimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        childTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ToDoList.class));
            }
        });

        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,UserProfile.class));
            }
        });

        BackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,SignUp.class));
            }
        });

    }
}