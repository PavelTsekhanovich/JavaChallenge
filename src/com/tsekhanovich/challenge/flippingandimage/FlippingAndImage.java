package com.tsekhanovich.challenge.flippingandimage;

import java.util.Arrays;

/**
 * @author Pavel Tsekhanovich 13.07.2018
 * <p>
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * <p>
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 * <p>
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * <p>
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * <p>
 * Notes:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */

public class FlippingAndImage {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}})));
    }

    private static int[][] flipAndInvertImage(int[][] sourceArray) {
        for (int[] internalArray : sourceArray) {
            flipRow(internalArray);
            invertRow(internalArray);
        }
        return sourceArray;
    }

    private static void flipRow(int[] arrayToFlip) {
        for (int i = 0, j = arrayToFlip.length - 1; ; i++, j--) {
            if (i >= j) {
                return;
            }
            int iElement = arrayToFlip[i];
            arrayToFlip[i] = arrayToFlip[j];
            arrayToFlip[j] = iElement;
        }
    }

    private static void invertRow(int[] arrayToInvert) {
        for (int i = 0; i < arrayToInvert.length; i++) {
            arrayToInvert[i] = arrayToInvert[i] == 1 ? 0 : 1;
        }
    }
}