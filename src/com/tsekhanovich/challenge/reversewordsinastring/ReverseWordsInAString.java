package com.tsekhanovich.challenge.reversewordsinastring;

/**
 * @author Pavel Tsekhanovich 09.07.2018
 * <p>
 * Given a string, you need to reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 * <p>
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * <p>
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string
 */

public class ReverseWordsInAString {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    private static String reverseWords(String line) {
        String[] words = line.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

}
