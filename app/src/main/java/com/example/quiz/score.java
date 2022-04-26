package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class score extends AppCompatActivity {
  ProgressBar progressBar;
  TextView textView;
  Handler handler=new Handler();
  int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        progressBar=findViewById(R.id.progress_bar);
        textView=findViewById(R.id.pourcentage);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                startProgress();

            }
        });
        thread.start();
    }
    public  void  startProgress(){

            try{
                Thread.sleep(50);
                progressBar.setProgress(MainActivity.global_score);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    textView.setText(String.valueOf(MainActivity.global_score)+"%");
                }
            });

    }
}