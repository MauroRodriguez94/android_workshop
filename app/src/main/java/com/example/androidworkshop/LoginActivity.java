package com.example.androidworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText userNameInput = findViewById(R.id.user_name);
        final EditText passwordInput = findViewById(R.id.user_password);
        final Button continueButton = findViewById(R.id.continue_button);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String userName = userNameInput.getText().toString();
                String password = passwordInput.getText().toString();
                Log.d("Workshop Log", "Boton clickeado: " + userName + " - " + password);
                goToWelcomeScreen();
            }
        });
    }

    private void goToWelcomeScreen() {
        Intent welcomeIntent = new Intent(this, WelcomeActivity.class);
        startActivity(welcomeIntent);
    }
}
