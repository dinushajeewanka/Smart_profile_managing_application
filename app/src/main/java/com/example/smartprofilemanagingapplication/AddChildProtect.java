package com.example.smartprofilemanagingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import io.realm.Realm;

public class AddChildProtect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child_protect);

        MaterialButton socialM = findViewById(R.id.socalMedia);
        MaterialButton Addlocation = findViewById(R.id.addlocation);

        socialM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddChildProtect.this,ProtectionPassword.class));
            }
        });

        Addlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925, 19.0513"));
                Intent chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);

            }
        });

//        EditText titleInput = findViewById(R.id.titleinput);
//
//        EditText descriptionInput = findViewById(R.id.descriptioninput);
//        MaterialButton saveBtn = findViewById(R.id.savebtn);
//        MaterialButton addloc = findViewById(R.id.addlocation);
//
//
//        Realm.init(getApplicationContext());
//        Realm realm = Realm.getDefaultInstance();
//
//        saveBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String titlee = titleInput.getText().toString();
//                String descriptionn = descriptionInput.getText().toString();
//                long createdTimee = System.currentTimeMillis();
//
//                realm.beginTransaction();
//                ChildProtectionNote note = realm.createObject(ChildProtectionNote.class);
//                note.setTitlee(titlee);
//                note.setDescriptionn(descriptionn);
//                note.setCreatedTimee(createdTimee);
//                realm.commitTransaction();
//                Toast.makeText(getApplicationContext(),"Protection saved",Toast.LENGTH_SHORT).show();
//                finish();
//
//
//            }
//        });
//
//        addloc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(AddChildProtect.this,ChuldProtection.class));
//
//            }
//        });

    }
}