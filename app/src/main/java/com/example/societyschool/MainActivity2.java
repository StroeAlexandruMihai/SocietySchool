package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button btn_desc, btn_cred, btn_quizz, btn_profil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_desc = (Button) findViewById(R.id.btn_desc);
        btn_desc.setOnClickListener(this);

        btn_quizz = (Button) findViewById(R.id.btn_quizz);
        btn_quizz.setOnClickListener(this);

        btn_profil = (Button) findViewById(R.id.btn_profil);
        btn_profil.setOnClickListener(this);

        btn_cred= (Button) findViewById(R.id.btn_cred);
        btn_cred.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_desc:
                startActivity(new Intent(this,ActivityDescopera.class));
                break;
            case R.id.btn_profil:
                startActivity(new Intent(this,ProfileActivity.class));
                break;
            case R.id.btn_cred:
                startActivity(new Intent(this,ActivityCredits.class));
                break;
            case R.id.btn_quizz:
                startActivity(new Intent(this,QuizzActivity.class));
                break;

        }
    }
}