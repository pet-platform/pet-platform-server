package com.member.global.validator;

import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean validate(String password) {
        return pattern.matcher(password).matches();
    }
}
