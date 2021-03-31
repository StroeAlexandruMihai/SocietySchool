package com.example.societyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PuzzleActivity extends AppCompatActivity {

    TextView r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
    ImageView img_full,img_empty;
    Button btn_check;

    int score = 0;

    String a1 = "atriu drept";
    String a2 = "atriu stang";
    String a3 = "vena cava superioara";
    String a4 = "aorta";
    String a5 = "artera pulmonara";
    String a6 = "vena pulmonara";
    String a7 = "valva mitrala";
    String a8 = "valva aortica";
    String a9 = "ventriculul stang";
    String a10 = "ventriculul drept";
    String a11 = "vena cava inferioara";
    String a12 = "valva tricupsida";
    String a13 = "valva pulmonara";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        r9 = findViewById(R.id.r9);
        r10 = findViewById(R.id.r10);
        r11 = findViewById(R.id.r11);
        r12 = findViewById(R.id.r12);
        r13 = findViewById(R.id.r13);

        img_full = findViewById(R.id.img_full);
        img_empty = findViewById(R.id.img_empty);

        img_full.setVisibility(View.INVISIBLE);
        img_empty.setVisibility(View.VISIBLE);

        btn_check = findViewById(R.id.btn_check);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r1.getText().toString().equals(a1)){
                    score++;
                }


                if(r2.getText().toString().equals(a2)){

                    score++;
                }


                if(r3.getText().toString().equals(a3)){

                    score++;
                }


                if(r4.getText().toString().equals(a4)){

                    score++;
                }

                if(r5.getText().toString().equals(a5)){

                    score++;
                }


                if(r6.getText().toString().equals(a6)){

                    score++;
                }


                if(r7.getText().toString().equals(a7)){

                    score++;
                }


                if(r8.getText().toString().equals(a8)){

                    score++;
                }


                if(r9.getText().toString().equals(a9)){

                    score++;
                }

                if(r10.getText().toString().equals(a10)){

                    score++;
                }

                if(r11.getText().toString().equals(a11)){

                    score++;
                }


                if(r12.getText().toString().equals(a12)){

                    score++;
                }

                if(r13.getText().toString().equals(a13)){

                    score++;
              }


                img_full.setVisibility(View.VISIBLE);
                img_empty.setVisibility(View.INVISIBLE);

                Toast.makeText(PuzzleActivity.this, "Scorul" + score + "!", Toast.LENGTH_SHORT).show();
                score = 0;

            }
        });


    }
}