package com.example.ganit_kit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements logointerface{

    ArrayList<logomodel> arrfeatures = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(this));

        arrfeatures.add(new logomodel(R.drawable.bmiji,"BMI :-","Body mass index"));
        arrfeatures.add(new logomodel(R.drawable.maths_table,"Tables :-","From 1 to 50"));
        arrfeatures.add(new logomodel(R.drawable.abcd,"Alphabet's :-","A to Z"));
        arrfeatures.add(new logomodel(R.drawable.operation,"Arthmatic's :-"," Operation's"));




        logoadapter  adapter = new logoadapter(this,arrfeatures,this);
        rv.setAdapter(adapter);
    }

    @Override
    public void methodname(int Position) {

    if(Position == 0){
        Intent a = new Intent(MainActivity2.this, Bmi.class);
        startActivity(a);
    } else if (Position == 1) {
        Intent b = new Intent(MainActivity2.this, tables.class);
        startActivity(b);
    } else if (Position == 2) {
        Intent c = new Intent(MainActivity2.this, add.class);
        startActivity(c);
    } else if (Position == 3) {
        Intent d = new Intent(MainActivity2.this, sub.class);
        startActivity(d);
    }
    }
    }
    