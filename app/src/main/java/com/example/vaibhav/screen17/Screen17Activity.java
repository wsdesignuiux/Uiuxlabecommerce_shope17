package com.example.vaibhav.screen17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Screen17_Adapter;
import model.Screen17_Model;

public class Screen17Activity extends AppCompatActivity {

    private Integer img[] = {R.drawable.men, R.drawable.giral, R.drawable.giral1,
            R.drawable.men, R.drawable.giral, R.drawable.giral1};

    private RecyclerView recyclerView;
    private ArrayList<Screen17_Model> screen17_models;
    private Screen17_Adapter screen17_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen17);

        recyclerView = findViewById(R.id.dinner);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Screen17Activity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        screen17_models = new ArrayList<>();

        for (int i = 0; i < img.length; i++) {
            Screen17_Model ab = new Screen17_Model(img[i]);
            screen17_models.add(ab);
        }
        screen17_adapter = new Screen17_Adapter(Screen17Activity.this, screen17_models);
        recyclerView.setAdapter(screen17_adapter);
    }
}