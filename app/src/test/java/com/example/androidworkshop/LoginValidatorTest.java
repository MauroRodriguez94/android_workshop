package com.example.androidworkshop;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lgarbarini on 2019-05-22.
 */
public class LoginValidatorTest {

    @Test
    public void isValidLogin_withUsername_andPassword_returnsTrue() {
        LoginValidator loginValidator = new LoginValidator();

        assertTrue(loginValidator.isValidLogin("lupita", "1234"));
    }

    @Test
    public void isValidLogin_withEmptyUsername_andPassword_returnsFalse() {
        LoginValidator loginValidator = new LoginValidator();

        assertFalse(loginValidator.isValidLogin("", "1234"));
    }

    @Test
    public void isValidLogin_withUsername_andEmptyPassword_returnsFalse() {
        LoginValidator loginValidator = new LoginValidator();

        assertFalse(loginValidator.isValidLogin("Lupita", ""));
    }


    @Test
    public void isValidLogin_withEmptyUsername_andEmptyPassword_returnsFalse() {
        LoginValidator loginValidator = new LoginValidator();

        assertFalse(loginValidator.isValidLogin("", ""));
    }

}