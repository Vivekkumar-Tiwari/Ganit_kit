package com.example.ganit_kit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


        Button fragbtn;
        EditText wt,ft,inch;
        TextView txtview;
        TextView btn;
       CardView card1;

       fragbtn = findViewById(R.id.female01);
        card1 = findViewById(R.id.card);
        wt = findViewById(R.id.txt1);
        ft = findViewById(R.id.txt2);
        inch = findViewById(R.id.txt3);
        txtview = findViewById(R.id.txt4);
        btn = findViewById(R.id.btn01);
        
        fragbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bmi.this, "Girls section is under progressed 😊", Toast.LENGTH_SHORT).show();
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int weight = Integer.parseInt(wt.getText().toString());
                    int feet = Integer.parseInt(ft.getText().toString());
                    int in = Integer.parseInt(inch.getText().toString());

                    if (weight <= 0 || feet < 0 || in < 0 || in > 12) {
                        throw new Exception("Please enter valid values.");
                    }

                    int totalinch = feet * 12 + in;
                    double totalcm = totalinch * 2.52;
                    double totalm = 100 / totalcm;

                    double bmi = weight / (totalcm * totalm);

                    if (bmi > 25 && bmi < 100) {
                        txtview.setText("You are overweight :🥹:");
                        card1.setBackgroundColor(getColor(R.color.Red));
                    } else if (bmi < 18 && bmi > 1) {
                        txtview.setText("You are underweight :🥹:");
                        card1.setBackgroundColor(getColor(R.color.Red));
                    } else {
                        txtview.setText("You are Healthy :🫡:");
                        card1.setBackgroundColor(getColor(R.color.Green));
                    }

                } catch (NumberFormatException ex) {
                    txtview.setText("Please enter valid numbers only.");
                    card1.setBackgroundColor(getColor(R.color.Red));
                } catch (Exception ex) {
                    txtview.setText(ex.getMessage());
                    card1.setBackgroundColor(getColor(R.color.Red));
                }
            }
        });
    }
}