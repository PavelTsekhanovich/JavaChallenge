package com.tsekhanovich.challenge.palindrome;

public class Palindrome {

    private static boolean isPalindrome(String word) {
        StringBuilder wordToReverse = new StringBuilder(word);
        wordToReverse.reverse();
        return word.equalsIgnoreCase(wordToReverse.toString());
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Test"));
        System.out.println(Palindrome.isPalindrome("Polop"));
    }
}
