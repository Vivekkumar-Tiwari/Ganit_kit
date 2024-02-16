package com.example.ganit_kit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;

public class add extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        ShapeableImageView btn;
        EditText a, b;
        TextView c;

        btn = findViewById(R.id.btnid);
        a = findViewById(R.id.a_id);
        b = findViewById(R.id.b_id);
        c = findViewById(R.id.textviewid);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int A = Integer.parseInt(a.getText().toString());
                    int B = Integer.parseInt(b.getText().toString());

                    int C = A + B;

                    c.setText(String.valueOf(C)); // Convert the result to a String

                } catch (NumberFormatException e) {
                    // Handle any parsing errors (e.g., if input is not a valid integer)
                    c.setText("Invalid input"); // Display an error message
                }
            }
        });
    }

}
