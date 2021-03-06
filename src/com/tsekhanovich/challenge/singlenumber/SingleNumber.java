package com.tsekhanovich.challenge.singlenumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Tsekhanovich 22.07.2018
 * <p>
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 */

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    private static int singleNumber(int[] nums) {
        Set<Integer> uniqueValue = new HashSet<>();
        for (int number : nums) {
            if (uniqueValue.contains(number)) {
                uniqueValue.remove(number);
            } else {
                uniqueValue.add(number);
            }
        }
        return uniqueValue.iterator().next();
    }
}
