package com.example.smartprofilemanagingapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;
import io.realm.Sort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ChuldProtection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuld_protection);

            MaterialButton addNoteBtn = findViewById(R.id.addnewnotebtn);

            addNoteBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(ChuldProtection.this,AddChildProtect.class));
                }
            });
//
//            Realm.init(getApplicationContext());
//            Realm realm = Realm.getDefaultInstance();
//
//            RealmResults<ChildProtectionNote> notesListt = realm.where(ChildProtectionNote.class).findAllSorted("createdTime", Sort.DESCENDING);
//
//
//            RecyclerView recyclerView = findViewById(R.id.recyclerview);
//            recyclerView.setLayoutManager(new LinearLayoutManager(this));
//            MyAdapterChild myAdapterChild = new MyAdapterChild(getApplicationContext(),notesListt);
//            recyclerView.setAdapter(myAdapterChild);
//
//            notesListt.addChangeListener(new RealmChangeListener<RealmResults<ChildProtectionNote>>() {
//                @Override
//                public void onChange(RealmResults<ChildProtectionNote> notes) {myAdapterChild.notifyDataSetChanged();
//                }
//            });
        }
    }
