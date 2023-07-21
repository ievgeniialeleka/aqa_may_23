package com.hillel.lesson_15;

public class LoginUtils {
    public static boolean validateLogin(String login) throws WrongLoginException {
        if (login.contains("_") && login.length() < 20) return true;
        else throw new WrongLoginException("Login must contain underscore and be less than 20 characters.", login);
    }

    public static boolean validatePassword(String password, String confirmpassword) throws WrongPasswordException {
        if(password.contains("_") && password.contains("!") && password.length() < 20 && password.equals(confirmpassword))
            return true;
        else throw new WrongPasswordException("Password is of incorrect format or doesn't match confirm password.", password);
    }

    public static boolean validateLoginInfo(String login, String password, String confirmpassword) {
        try {
            return validateLogin(login) && validatePassword(password, confirmpassword);
        } catch (WrongLoginException exc) {
            System.out.println(exc);
        } catch (WrongPasswordException exc) {
            System.out.println(exc);
        }
        return false;
    }
}
