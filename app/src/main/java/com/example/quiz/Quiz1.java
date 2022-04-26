package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz1 extends AppCompatActivity {
   Button B1;
   RadioGroup radioGroup;
   RadioButton radioButton;
   int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        B1=findViewById(R.id.button3);
        radioGroup=findViewById(R.id.radio1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selected);
                String string=radioButton.getText().toString();
                if(string.equals("Oui")){
                    MainActivity.global_score = MainActivity.global_score+25 ;
                }

                startActivity(new Intent(Quiz1.this,Quiz2.class));
                //startActivity(new Intent(Quiz1.this,Quiz2.class).putExtra("score",score));
            }
        });
    }
}