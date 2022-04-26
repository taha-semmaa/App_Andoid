package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz4 extends AppCompatActivity {
    Button Btn;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        Btn=findViewById(R.id.button6);
        radioGroup=findViewById(R.id.radio4);
        // Intent itent=getIntent();
        //int score= itent.getIntExtra("score",0);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selected);
                String string=radioButton.getText().toString();

                if(string.equals("Oui"))
                {
                    MainActivity.global_score+=25;
                }
                startActivity(new Intent(Quiz4.this,score.class));
                //startActivity(new Intent(Quiz1.this,Quiz2.class).putExtra("score",score));
            }
        });
    }
}