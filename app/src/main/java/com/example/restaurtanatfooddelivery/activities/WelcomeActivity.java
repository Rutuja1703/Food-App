package com.example.restaurtanatfooddelivery.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurtanatfooddelivery.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void register(View view) {
        Intent intent =new Intent(WelcomeActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void signin(View view) {
        Intent intent =new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}