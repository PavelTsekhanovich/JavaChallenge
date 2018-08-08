package com.tsekhanovich.challenge.sortedsearch;

import java.util.Arrays;

/**
 * @author Pavel Tsekhanovich 08.08.2018
 * <p>
 * Implement function countNumbers that accepts a sorted array of integers and counts the number of array elements
 * that are less than the parameter lessThan.
 * <p>
 * For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because
 * there are two array elements less than 4.
 * <p>
 * https://www.testdome.com/d/java-interview-questions/4
 */

public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        int indexOfKey = Arrays.binarySearch(sortedArray, lessThan);
        return indexOfKey < 0 ? (-indexOfKey) - 1 : indexOfKey;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 5, 7}, 4));
    }
}