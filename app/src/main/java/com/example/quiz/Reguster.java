package com.example.quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Region;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Reguster extends AppCompatActivity {
   Button B1;
   EditText name,email,password,confirm_pass;
   FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguster);
        B1=findViewById(R.id.button2);
        name=findViewById(R.id.textName);
        email=findViewById(R.id.editTextTextEmailAddress2);
        password=findViewById(R.id.editTextTextPassword2);
        confirm_pass=findViewById(R.id.editTextTextPassword3);
        auth=FirebaseAuth.getInstance();
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(email.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Please enter your email",Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(password.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Please enter your password",Toast.LENGTH_LONG).show();
                    return;
                }
                if(!password.getText().toString().equals(confirm_pass.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Please check your password and confirm_password",Toast.LENGTH_LONG).show();
                    return;
                }
                auth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getApplicationContext(),"mbrouk",Toast.LENGTH_LONG).show();
                            startActivity(new Intent(Reguster.this,MainActivity.class));

                        }
                        else{
                            Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });

            }
        });
    }
}