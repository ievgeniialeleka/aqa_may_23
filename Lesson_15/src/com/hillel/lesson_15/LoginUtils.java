package com.hillel.lesson_15;

import java.util.Scanner;

public class LoginUtils {
    public static boolean validateLogin(String login) {
        return login.contains("_") && login.length() < 20;

    }

    public static boolean validatePassword(String password) {
        return password.contains("_") && password.contains("!") && password.length() < 20;
    }

    public static boolean validateLoginInfo(String login, String password, String confirmpassword) throws WrongLoginException, WrongPasswordException {
        if (!validateLogin(login))
            throw new WrongLoginException("Login must contain underscore and be less than 20 characters", login);
        else if (!validatePassword(password))
            throw new WrongPasswordException("Password must contain underscore and ! and be less than 20 characters");
        else if (!password.equals(confirmpassword))
            throw new WrongPasswordException("Password and confirm password must be the same!");
        else
            return true;
    }
}
