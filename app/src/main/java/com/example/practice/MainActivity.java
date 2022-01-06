package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EditText_email, EditText_password;
    Button Button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText_email = findViewById(R.id.EditText_email);
        EditText_password = findViewById(R.id.EditText_password);
        Button_login = findViewById(R.id.Button_login);

        EditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("email-watch",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = EditText_email.getText().toString();
                String password = EditText_password.getText().toString();

                if(validation(email,password)){
                    Intent intent = new Intent(MainActivity.this,Home.class);
                    intent.putExtra("email",email);
                    intent.putExtra("password",password);
                    startActivity(intent);
                }


            }
        });
    }
    public boolean validation(String email, String password){
        String userID = "kong";
        String userPW = "1234";

        if(userID.equals(email) && userPW.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}