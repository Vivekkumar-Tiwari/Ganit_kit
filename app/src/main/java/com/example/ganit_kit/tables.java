package com.example.ganit_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

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
                StringBuilder tableText = new StringBuilder();

                for (int i = 1; i <= 10; i++) {
                    int finalProduct = n * i;
                    tableText.append(n).append(" * ").append(i).append(" = ").append(finalProduct).append("\n");
                }

                // Set the calculated table to the output TextView
                output.setText(tableText.toString());


            }
        });



    }
}