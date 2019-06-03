package com.example.androidworkshop;

import android.content.Intent;
import android.net.Uri;
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
                if (new LoginValidator().isValidLogin(userName, password)) {
                    goToWelcomeScreen(userName);
                } else {
                    goToErrorScreen();
                }
            }
        });
    }

    private void goToErrorScreen() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("workshop://error")));
    }

    private void goToWelcomeScreen(String userName) {
        Intent welcomeIntent = new Intent(this, WelcomeActivity.class);
        welcomeIntent.putExtra("user_name", userName);
        startActivity(welcomeIntent);
    }
}
