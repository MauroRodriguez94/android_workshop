package com.example.androidworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText userNameInput = findViewById(R.id.user_name);
        EditText passwordInput = findViewById(R.id.user_password);
        Button continueButton = findViewById(R.id.continue_button);
    }
}
