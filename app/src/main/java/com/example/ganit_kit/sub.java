package com.example.ganit_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        EditText editText1,editText2;
        TextView ans;
        Button addition, substraction,multiplication,Division;

        editText1 = findViewById(R.id.firstoption);
        editText2 = findViewById(R.id.secondOption);
        ans = findViewById(R.id.answer);
        addition = findViewById(R.id.add);
        substraction = findViewById(R.id.sub);
        multiplication = findViewById(R.id.mul);
        Division = findViewById(R.id.div);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double a = Integer.parseInt(editText1.getText().toString());
                    double b = Integer.parseInt(editText2.getText().toString());
                    double c = a + b;
                    ans.setText("Answer: " + c);
                    ans.setBackgroundColor(getColor(R.color.black));
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-numeric values)
                    ans.setText("Invalid input");
                    ans.setBackgroundColor(getColor(R.color.red)); // For example
                } catch (Exception e) {
                    // Handle any other unexpected errors
                    ans.setText("An error occurred");
                    ans.setBackgroundColor(getColor(R.color.red)); // For example
                    e.printStackTrace(); // Log the exception for debugging
                }
            }
        });


        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double a = Integer.parseInt(editText1.getText().toString());
                    double b = Integer.parseInt(editText2.getText().toString());
                    double c = a - b;
                    ans.setText("Answer: " + c);
                    ans.setBackgroundColor(getColor(R.color.black));
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-numeric values)
                    ans.setText("Invalid input");
                    ans.setBackgroundColor(getColor(R.color.red)); // For example
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double a = Integer.parseInt(editText1.getText().toString());
                    double b = Integer.parseInt(editText2.getText().toString());
                    double c = a * b;
                    ans.setText("Answer: " + c);
                    ans.setBackgroundColor(getColor(R.color.black));
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-numeric values)
                    ans.setText("Invalid input");
                    ans.setBackgroundColor(getColor(R.color.red)); // For example
                }
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double a = Integer.parseInt(editText1.getText().toString());
                    double b = Integer.parseInt(editText2.getText().toString());
                    double c = a / b;
                    ans.setText("Answer: " + c);
                    ans.setBackgroundColor(getColor(R.color.black));
                } catch (NumberFormatException e) {
                    // Handle invalid input (non-numeric values)
                    ans.setText("Invalid input");
                    ans.setBackgroundColor(getColor(R.color.red)); // For example
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    ans.setText("Cannot divide by zero");
                    ans.setBackgroundColor(getColor(R.color.red)); // For example
                }
            }
        });

    }
}