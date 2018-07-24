package com.tsekhanovich.challenge.singlenumber3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Tsekhanovich 24.07.2018
 * <p>
 * Given an array of numbers nums, in which exactly two elements appear only once
 * and all the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 * <p>
 * Input:  [1,2,1,3,2,5]
 * Output: [3,5]
 */

public class SingleNumber3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    private static int[] singleNumber(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (Integer number : nums) {
            if (uniqueValues.contains(number)) {
                uniqueValues.remove(number);
            } else {
                uniqueValues.add(number);
            }
        }
        return uniqueValues.stream().mapToInt(Number::intValue).toArray();
    }
}
