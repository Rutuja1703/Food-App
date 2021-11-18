package com.example.restaurtanatfooddelivery.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurtanatfooddelivery.MainActivity;
import com.example.restaurtanatfooddelivery.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void Signin(View view) {

    }

    public void home(View view) {
       Intent intent=new Intent(RegistrationActivity.this, MainActivity.class);
        startActivity(intent);
    }



    public void signinpage(View view) {
        Intent intent=new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}