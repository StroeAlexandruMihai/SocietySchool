package com.example.societyschool;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class QuizzActivity extends AppCompatActivity {

 Button button4, button3, button2, button1;
 TextView textView_score, textView_question;

 private Questions mQuestion = new Questions();

 private String mAnswer;

 private Integer mScore = 0;

 private int mQuestionLenght = mQuestion.mQuestion.length;

 ImageView logo;

 Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        logo = (ImageView) findViewById(R.id.logo);

        textView_score = (TextView) findViewById(R.id.textView_score);
        textView_question = (TextView) findViewById(R.id.textView_question);

        textView_score.setText("SCOR " + mScore);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizzActivity.this,MainActivity2.class));
            }
        });

        r = new Random();

        updateQuestion(r.nextInt(mQuestionLenght));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getText() == mAnswer){
                    mScore++;
                    textView_score.setText("SCOR " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getText() == mAnswer){
                    mScore++;
                    textView_score.setText("SCOR " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(button3.getText() == mAnswer){
                    mScore++;
                    textView_score.setText("SCOR " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(button4.getText() == mAnswer){
                    mScore++;
                    textView_score.setText("SCOR " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                }else{
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int x){
        textView_question.setText(mQuestion.getQuestion(x));

        button1.setText(mQuestion.getChoices0(x));
        button2.setText(mQuestion.getChoices1(x));
        button3.setText(mQuestion.getChoices2(x));
        button4.setText(mQuestion.getChoices3(x));

        mAnswer = mQuestion.getCorrectAns(x);

    }

    private void gameOver(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizzActivity.this);
        alertDialogBuilder
                .setMessage("Quizz a luat sfarsit! Scorul dvs este " + mScore)
                .setCancelable(false)
                .setPositiveButton("Quizz nou",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),QuizzActivity.class));
                            }
                        }
                )

           .setNegativeButton("Iesi din quizz!",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    finish();
;                    }
                }
        );
AlertDialog alertDialog = alertDialogBuilder.create();
alertDialog.show();
    }

}