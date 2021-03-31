package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainbioActivity extends AppCompatActivity {
Button desc_bio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainbio);

        desc_bio = findViewById(R.id.desc_bio);

        desc_bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainbioActivity.this, biologie.class));
            }
        });

    }
}