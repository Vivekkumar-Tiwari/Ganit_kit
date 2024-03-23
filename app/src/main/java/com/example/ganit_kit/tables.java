package com.example.ganit_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

public class tables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        TextView btnn, output;
        EditText input;

        btnn = findViewById(R.id.txtbtn);
        output = findViewById(R.id.txttablesno);
        input = findViewById(R.id.txttables);

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(input.getText().toString());
                if (n > 100) {
                    // Show a toast message when the user tries to generate a table for a number greater than 100
                    Toast.makeText(tables.this, "sry it is not avilable:", Toast.LENGTH_SHORT).show();
                    // You can add a toast message here, for example:
                    // Toast.makeText(getApplicationContext(), "Table for " + n + " is not available as it exceeds 100.", Toast.LENGTH_SHORT).show();
                } else {
                    StringBuilder tableText = new StringBuilder();
                    for (int i = 1; i <= 10; i++) {
                        int finalProduct = n * i;
                        tableText.append(n).append(" * ").append(i).append(" = ").append(finalProduct).append("\n");
                    }
                    // Set the calculated table to the output TextView
                    output.setText(tableText.toString());
                }
            }
        });

    }
}