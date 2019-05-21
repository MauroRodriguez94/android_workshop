package com.example.androidworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String userName = getIntent().getStringExtra("user_name");

        TextView welcomeMessageView = findViewById(R.id.welcome_text);
        welcomeMessageView.setText(getString(R.string.workshop_welcome, userName));
    }
}
