package com.tsekhanovich.challenge.reversestring;


/**
 * @author Pavel Tsekhanovich 10.08.2018
 *
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example:
 * Given s = "hello", return "olleh".
 */

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
