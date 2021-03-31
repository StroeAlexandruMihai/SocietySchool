package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDescopera extends AppCompatActivity implements View.OnClickListener{
private Button mate, chimie, biologie, sport, istorie, informatica, fizica, economie, geografie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descopera);

        mate = (Button) findViewById(R.id.mate);
        mate.setOnClickListener(this);

        chimie = (Button) findViewById(R.id.chimie);
        chimie.setOnClickListener(this);

        biologie = (Button) findViewById(R.id.biologie);
        biologie.setOnClickListener(this);

        sport = (Button) findViewById(R.id.sport);
        sport.setOnClickListener(this);

        istorie = (Button) findViewById(R.id.istorie);
        istorie.setOnClickListener(this);

        informatica = (Button) findViewById(R.id.informatica);
        informatica.setOnClickListener(this);

        fizica = (Button) findViewById(R.id.fizica);
        fizica.setOnClickListener(this);

        economie = (Button) findViewById(R.id.economie);
        economie.setOnClickListener(this);

        geografie = (Button) findViewById(R.id.geografie);
        geografie.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.mate:
                startActivity(new Intent(this,mate.class));
                break;
            case R.id.chimie:
                startActivity(new Intent(this,chimie.class));
                break;
            case R.id.biologie:
                startActivity(new Intent(this,MainbioActivity.class));
                break;
            case R.id.sport:
                startActivity(new Intent(this,sport.class));
                break;
            case R.id.istorie:
                startActivity(new Intent(this,istorie.class));
                break;
            case R.id.informatica:
                startActivity(new Intent(this,informatica.class));
                break;
            case R.id.fizica:
                startActivity(new Intent(this,fizica.class));
                break;
            case R.id.economie:
                startActivity(new Intent(this,economie.class));
                break;
            case R.id.geografie:
                startActivity(new Intent(this,geografie.class));
                break;
        }
    }
}