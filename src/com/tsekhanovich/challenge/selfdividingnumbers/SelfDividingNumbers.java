package com.tsekhanovich.challenge.selfdividingnumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Tsekhanovich 26.07.2018
 * <p>
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * Note:
 * <p>
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

public class SelfDividingNumbers {

    public static void main(String[] args) {
        selfDividingNumbers(1, 22).forEach(System.out::println);
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String number = String.valueOf(i);
            boolean badDigit = false;
            for (int j = 0; j < number.length(); j++) {
                int digit = Character.digit(number.charAt(j), 10);
                if (digit == 0 || i % digit != 0) {
                    badDigit = true;
                    break;
                }
            }
            if (!badDigit) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}