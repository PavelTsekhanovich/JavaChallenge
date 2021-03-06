package com.tsekhanovich.challenge.validanagram;

/**
 * @author Pavel Tsekhanovich 19.07.2018
 * <p>
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * <p>
 * https://leetcode.com/problems/valid-anagram/description/
 */

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < firstWord.length(); i++) {
            table[firstWord.charAt(i) - 'a']++;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            table[secondWord.charAt(i) - 'a']--;
            if (table[secondWord.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
