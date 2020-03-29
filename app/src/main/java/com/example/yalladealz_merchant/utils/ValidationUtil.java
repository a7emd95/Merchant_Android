package com.example.yalladealz_merchant.utils;

public class ValidationUtil {

    public static boolean validEmail(String email) {
        String regex = "^([0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9})$";
        return email.matches(regex);
    }

    public static boolean validPassword(String password) {
        return password.length() >= 6;
    }

}
