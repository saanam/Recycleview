package com.e.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);

        List<contact> contactList = new ArrayList<>();
        contactList.add(new contact("Ayush Pandey", "000000000", R.drawable.image1));
        contactList.add(new contact("Mohomad Pandey", "111111111", R.drawable.image2));
        contactList.add(new contact("Elvin Pandey", "222222222", R.drawable.image3));

        Contactadapter contactadapter = new Contactadapter(this, contactList);
        recyclerView.setAdapter(contactadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
