package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz2 extends AppCompatActivity {
   Button B1;
   RadioGroup radioGroup;
   RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
      // Intent itent=getIntent();
        //int score= itent.getIntExtra("score",0);
        B1=findViewById(R.id.button4);
        radioGroup=findViewById(R.id.radio2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selected);
                String string=radioButton.getText().toString();
                if(string.equals("A droite"))
                {
                    MainActivity.global_score=MainActivity.global_score+25;
                }
                startActivity(new Intent(Quiz2.this,Quiz3.class));
                //startActivity(new Intent(Quiz1.this,Quiz2.class).putExtra("score",score));
            }
        });
    }
}