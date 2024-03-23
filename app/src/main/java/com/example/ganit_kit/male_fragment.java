package com.example.ganit_kit;

import static androidx.core.app.NotificationCompat.getColor;
import androidx.core.content.ContextCompat;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class male_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_male_fragment, container, false);

        EditText wt, ft, inch;
        TextView txtview;
        TextView btn;
        CardView card1;

        card1 = view.findViewById(R.id.card);
        wt = view.findViewById(R.id.txt1);
        ft = view.findViewById(R.id.txt2);
        inch = view.findViewById(R.id.txt3);
        txtview = view.findViewById(R.id.txt4);
        btn = view.findViewById(R.id.btn01);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float weight = Float.parseFloat(wt.getText().toString());
                float height = Float.parseFloat(ft.getText().toString());
                float bmi = weight / (height * height);

                if (bmi > 25 && bmi < 100) {
                    txtview.setText("You are overweight :🥹:");
                    card1.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.Green));
                } else if (bmi < 18 && bmi > 1) {
                    txtview.setText("You are underweight :🥹:");
                    card1.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.Red));
                } else {
                    txtview.setText("You are Healthy :🫡:");
                    card1.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.Green));
                }
            }
        });


        return view;
    }

}