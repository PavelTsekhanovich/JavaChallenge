package com.tsekhanovich.challenge.judgeroutecircle;

/**
 * @author Pavel Tsekhanovich 17.07.2018
 * <p>
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
 * judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 * <p>
 * Input: "UD"
 * Output: true
 * <p>
 * Input: "LL"
 * Output: false
 */

public class JudgeRouteCircle {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    private static boolean judgeCircle(String moves) {
        int startPositionX = 0;
        int startPositionY = 0;
        for (char letter : moves.toCharArray()) {
            if (letter == 'U') {
                startPositionY++;
            } else if (letter == 'D') {
                startPositionY--;
            } else if (letter == 'R') {
                startPositionX++;
            } else if (letter == 'L') {
                startPositionX--;
            }
        }
        return startPositionX == 0 && startPositionY == 0;
    }
}
