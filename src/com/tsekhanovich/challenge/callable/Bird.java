package com.tsekhanovich.challenge.callable;

import java.util.concurrent.Callable;

/**
 * @author Pavel Tsekhanovich 09.07.2018
 * <p>
 * - chicken implements Bird
 * - a chicken lays an egg, that will hatch into a new chicken
 * - eggs from other types of birds should hatch into a new bird of their parent type
 * - hatching an egg for the second time throws an IllegalStateException
 * https://www.testdome.com/d/java-interview-questions/4
 */

public interface Bird {
    Egg lay();
}

class Chicken implements Bird {
    public Chicken() {
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        System.out.println(chicken instanceof Bird);
    }

    @Override
    public Egg lay() {
        return new Egg(Chicken::new);
    }
}

class Egg {
    Callable<Bird> bird;
    private boolean alreadyHatched;

    public Egg(Callable<Bird> createBird) {
        bird = createBird;
    }

    public Bird hatch() throws Exception {
        if (alreadyHatched) {
            throw new IllegalStateException();
        }
        alreadyHatched = true;
        return bird.call();
    }
}
