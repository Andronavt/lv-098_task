/**
 * Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent
 *  is an abstract class. Make the methods of Rodent abstract whenever possible.
 */
package com.sofserveinc.edu.lms.interfaces;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Maryan
 * 
 */

abstract class Rodent {
    private String name = "Rodent";

    public abstract void eat();

    @Override
    public String toString() {
	return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";

    public void eat() {
	System.out.println("Mouse eat()");
    }

    @Override
    public String toString() {
	return name;
    }
}

class Gerbil extends Rodent {
    private String name = "Gerbil";

    public void eat() {
	System.out.println("Gerbil eat()");
    }

    @Override
    public String toString() {
	return name;
    }

}

class Hamster extends Rodent {
    private String name = "Hamster";

    public void eat() {
	System.out.println("Hamster eat()");
    }

    @Override
    public String toString() {
	return name;
    }

}

class RandomGen {
    private Random rand = new Random();

    public Rodent next() {

	switch (rand.nextInt(5)) {
	default:
	case 0:
	    return new Gerbil();
	case 1:
	    return new Hamster();
	case 2:
	    return new Mouse();

	}

    }

}

public class Exercise1 {

    /**
     * @param args
     */
    private static RandomGen rand = new RandomGen();

    public static void main(String[] args) {
	int size = 10;
	Rodent[] arrRodent = new Rodent[size];
	for (int i = 0; i < arrRodent.length; i++) {
	    arrRodent[i] = rand.next();
	}

	System.out.println(Arrays.toString(arrRodent));
    }

}
