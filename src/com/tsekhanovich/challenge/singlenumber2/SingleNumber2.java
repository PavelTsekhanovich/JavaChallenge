package com.tsekhanovich.challenge.singlenumber2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Tsekhanovich 23.07.2018
 * <p>
 * Given a non-empty array of integers, every element appears three times except for one,
 * which appears exactly once. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Input: [2,2,3,2]
 * Output: 3
 * <p>
 * Input: [0,1,0,1,0,1,99]
 * Output: 99
 */

public class SingleNumber2 {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        Arrays.stream(nums).forEach(element -> occurrences.merge(element, 1, Integer::sum));
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
