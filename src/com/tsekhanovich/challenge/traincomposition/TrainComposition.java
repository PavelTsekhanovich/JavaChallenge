package com.tsekhanovich.challenge.traincomposition;


import java.util.LinkedList;

/**
 * @author Pavel Tsekhanovich 27.07.2018
 * <p>
 * A TrainComposition is built by attaching and detaching wagons from the left and the right sides.
 * <p>
 * For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13,
 * again from the left, we get a composition of two wagons (13 and 7 from left to right).
 * Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.
 * <p>
 * Implement a TrainComposition that models this problem.
 */

public class TrainComposition {

    //private Deque<Integer> train = new ArrayDeque<>();
    private LinkedList<Integer> linkedTrain = new LinkedList<>();

    private void attachWagonFromLeft(int wagonId) {
        //train.addFirst(wagonId);
        linkedTrain.addFirst(wagonId);
    }

    private void attachWagonFromRight(int wagonId) {
        //train.addLast(wagonId);
        linkedTrain.addLast(wagonId);
    }

    private int detachWagonFromLeft() {
        return linkedTrain.removeFirst();
        //return train.pollFirst();
    }

    private int detachWagonFromRight() {
        return linkedTrain.removeLast();
        //return train.pollLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}