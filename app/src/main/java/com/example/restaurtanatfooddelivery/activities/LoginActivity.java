package com.example.restaurtanatfooddelivery.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurtanatfooddelivery.MainActivity;
import com.example.restaurtanatfooddelivery.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    public void mainactivity(View view) {
       Intent intent=new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }



    public void Registerpage(View view) {
        Intent intent =new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }
}