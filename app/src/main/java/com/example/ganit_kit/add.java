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

        a = findViewById(R.id.a_id);
        b = findViewById(R.id.b_id);
        c = findViewById(R.id.textviewid);


    }

}
