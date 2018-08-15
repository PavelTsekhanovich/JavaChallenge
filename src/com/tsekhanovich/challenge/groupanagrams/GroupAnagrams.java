package com.tsekhanovich.challenge.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pavel Tsekhanovich 15.08.2018
 * <p>
 * Given an array of strings, group anagrams together.
 * <p>
 * ["eat", "tea", "tan", "ate", "nat", "bat"]
 * <p>
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

public class GroupAnagrams {

    public static void main(String[] args) {
        List<List<String>> anagrams = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        anagrams.forEach(System.out::println);
    }

    private static List<List<String>> groupAnagrams(String[] anagrams) {
        Map<String, List<String>> tempMap = new HashMap<>();
        for (String anagram : anagrams) {
            char[] chars = anagram.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!tempMap.containsKey(key)) {
                tempMap.put(key, new ArrayList<>());
            }
            tempMap.get(key).add(anagram);
        }
        return new ArrayList<>(tempMap.values());
    }

}