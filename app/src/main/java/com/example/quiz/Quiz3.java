package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz3 extends AppCompatActivity {
   Button B1;
   RadioButton radioButton;
   RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        // Intent itent=getIntent();
        //int score= itent.getIntExtra("score",0);
        B1=findViewById(R.id.button5);
       radioGroup=findViewById(R.id.radio3);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selected);
                String string=radioButton.getText().toString();
                if(string.equals("Oui"))
                {
                    MainActivity.global_score+=25;
                }
                startActivity(new Intent(Quiz3.this,Quiz4.class));
                //startActivity(new Intent(Quiz1.this,Quiz2.class).putExtra("score",score));
            }
        });
    }
}