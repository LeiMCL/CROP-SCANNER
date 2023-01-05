package com.example.cropscanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CropsActivity extends AppCompatActivity {
    RecyclerView recycler;
    List<DataModel> modelList;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);

        modelList = new ArrayList<>();
        recycler = findViewById(R.id.crops);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        modelList.add(new DataModel("Banana","",0));
        modelList.add(new DataModel("Mango","",1));
        modelList.add(new DataModel("Santol","",2));
        modelList.add(new DataModel("Rambutan","",3));
        modelList.add(new DataModel("Tomato","",4));
        adapter = new CustomAdapter(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);
    }

}