package com.example.smartprofilemanagingapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.GenericSignatureFormatError;

public class ToDoListLocation extends AppCompatActivity {
    public Button btn_google_map;


    Button btPicker1;
    Button btPicker2;
    Button btPicker3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list_location);

        btPicker1 = findViewById(R.id.addlocation1);
        btPicker2 = findViewById(R.id.addlocation2);
        btPicker3 = findViewById(R.id.addlocation1);

        btPicker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        btPicker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

        btPicker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}