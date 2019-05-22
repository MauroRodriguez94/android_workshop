package com.example.androidworkshop;

/**
 * Created by lgarbarini on 2019-05-22.
 */
public class LoginValidator {

    boolean isValidLogin(String username, String password) {
        return !username.isEmpty() && !password.isEmpty();
    }
}
