package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView getEmail = findViewById(R.id.sendEmail);
        TextView getPassword = findViewById(R.id.sendPassword);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        String password  = bundle.getString("password");

        getEmail.setText(email);
        getPassword.setText(password);
    }
}