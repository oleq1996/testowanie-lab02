package com.company;

public class EmailValidator {

    public static boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

}
