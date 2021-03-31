package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fizica extends AppCompatActivity implements View.OnClickListener {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizica);

        logo = (ImageView)findViewById(R.id.logo);
        logo.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.logo:
                startActivity(new Intent(this,ActivityDescopera.class));
                break;
        }
    }
}