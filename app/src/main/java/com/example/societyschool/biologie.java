package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class biologie extends AppCompatActivity implements View.OnClickListener {

    private ImageView logo,curs,video,audio,test,puzzle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologie);

        logo = (ImageView)findViewById(R.id.logo);
        logo.setOnClickListener(this);

        curs = (ImageView)findViewById(R.id.curs);
        curs.setOnClickListener(this);

        video = (ImageView)findViewById(R.id.video);
        video.setOnClickListener(this);

        audio = (ImageView)findViewById(R.id.audio);
        audio.setOnClickListener(this);

        test = (ImageView)findViewById(R.id.test);
        test.setOnClickListener(this);

        puzzle = (ImageView)findViewById(R.id.puzzle);
        puzzle.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.logo:
                startActivity(new Intent(this,ActivityDescopera.class));
                break;
            case R.id.curs:
                startActivity(new Intent(this,CursActivity.class));
                break;
            case R.id.video:
                startActivity(new Intent(this,VideoActivity.class));
                break;
            case R.id.audio:
                startActivity(new Intent(this,AudioActivity.class));
                break;
            case R.id.test:
                startActivity(new Intent(this,TestActivity.class));
                break;
            case R.id.puzzle:
                startActivity(new Intent(this,PuzzleActivity.class));
                break;

        }
    }
}