package com.tsekhanovich.challenge.regex;

/**
 * @author Pavel Tsekhanovich 05.07.2018
 * @version 1.0
 *
 * The username must more or equals 6 letters but doesn't exceed 18 characters.
 * The username must contain only letters and optionally one hyphen (-).
 * The username must start with a letter and must not end with hyphen.
 */

public class CheckUsername {

    private static boolean validateUserName(String username) {
        String regexp = "^(?=[a-zA-Z]+[a-zA-Z0-9]*[-]?[a-zA-Z0-9]+$)[a-zA-Z0-9-]{6,18}$";
        return username.matches(regexp);
    }

    public static void main(String[] args) {
        System.out.println(validateUserName("Pavel-Tsekhanovich"));
        System.out.println(validateUserName("Pavel Tsekhanovich"));
    }

}
