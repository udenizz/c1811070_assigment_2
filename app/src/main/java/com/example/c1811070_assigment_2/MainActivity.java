package com.example.c1811070_assigment_2;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText eMail;
    Button eLogin;
    boolean isValid;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eMail=findViewById(R.id.l_email);
        eLogin=findViewById(R.id.l_button);

        eLogin.setOnClickListener(view -> {
            String inputtedMail=eMail.getText().toString();
            isValid=isValidEmail(inputtedMail);
            if(!isValid)
            {
                Toast.makeText(MainActivity.this,"Please enter valid e-mail!!",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this,"Lets Start!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    boolean isValidEmail(String target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }
}
