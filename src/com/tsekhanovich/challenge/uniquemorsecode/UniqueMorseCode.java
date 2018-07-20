package com.tsekhanovich.challenge.uniquemorsecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Pavel Tsekhanovich 20.07.2018
 * <p>
 * International Morse Code defines a standard encoding where each letter is mapped to a
 * series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * <p>
 * For convenience, the full table for the 26 letters of the English alphabet is given below
 * <p>
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
 * "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * <p>
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-").
 * We'll call such a concatenation, the transformation of a word.
 * <p>
 * Return the number of different transformations among all words we have.
 * <p>
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * <p>
 * There are 2 different transformations, "--...-." and "--...--.".
 * <p>
 * Note:
 * - The length of words will be at most 100.
 * - Each words[i] will have length in range [1, 12].
 * - words[i] will only consist of lowercase letters.
 */

public class UniqueMorseCode {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String[] MORSE_LETTERS = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    private static final Map<Character, String> morseCodes = new HashMap<>();

    static {
        morseCodes.put('a', ".-");
        morseCodes.put('b', "-...");
        morseCodes.put('c', "-.-.");
        morseCodes.put('d', "-..");
        morseCodes.put('e', ".");
        morseCodes.put('f', "..-.");
        morseCodes.put('g', "--.");
        morseCodes.put('h', "....");
        morseCodes.put('i', "..");
        morseCodes.put('j', ".---");
        morseCodes.put('k', "-.-");
        morseCodes.put('l', ".-..");
        morseCodes.put('m', "--");
        morseCodes.put('n', "-.");
        morseCodes.put('o', "---");
        morseCodes.put('p', ".--.");
        morseCodes.put('q', "--.-");
        morseCodes.put('r', ".-.");
        morseCodes.put('s', "...");
        morseCodes.put('t', "-");
        morseCodes.put('u', "..-");
        morseCodes.put('v', "...-");
        morseCodes.put('w', ".--");
        morseCodes.put('x', "-..-");
        morseCodes.put('y', "-.--");
        morseCodes.put('z', "--..");
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentationsWithMap(new String[]{"gin", "zen", "gig", "msg"}));
        System.out.println(uniqueMorseRepresentationsWithArray(new String[]{"gin", "zen", "gig", "msg"}));
    }

    private static int uniqueMorseRepresentationsWithMap(String[] words) {
        Set<String> uniqueCodes = new HashSet<>();
        for (String word : words) {
            StringBuilder wordInMorse = new StringBuilder();
            for (char letter : word.toCharArray()) {
                wordInMorse.append(morseCodes.get(letter));
            }
            uniqueCodes.add(wordInMorse.toString());
        }
        return uniqueCodes.size();
    }

    private static int uniqueMorseRepresentationsWithArray(String[] words) {
        Set<String> uniqueCodes = new HashSet<>();
        for (String word : words) {
            StringBuilder wordInMorse = new StringBuilder();
            for (char letter : word.toCharArray()) {
                wordInMorse.append(MORSE_LETTERS[LETTERS.indexOf(letter)]);
            }
            uniqueCodes.add(wordInMorse.toString());
        }
        return uniqueCodes.size();
    }
}
