package com.softserveinc.edu.lms.polymorphism;

import java.util.Arrays;
import java.util.Random;

/*
 * @author Maryan
 *  Modify Exercise 12 so that one of the member objects is a
 *  shared object with reference counting, and demonstrate that it works
 *  properly.
 */

/*
 * Exercise14
 */
class Shared1 {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared1() {
	System.out.println("Creating " + this);
    }

    public void addRef() {
	refcount++;
    }

    protected void dispose() {
	if (--refcount == 0) {
	    System.out.println("Disposing " + this);
	}
    }

}

class Rodent1 {
    protected Shared1 shared = new Shared1(); // Exercise14
    private String name = "Rodent1";
    private Characteristic character = new Characteristic("has tail");
    private Description descriptoin = new Description("small mamal");

    public void eat() {
	System.out.println("Rodent1 eat()");
    }

    @Override
    public String toString() {
	return name;
    }
}

class Mouse1 extends Rodent1 {
    private String name = "Mouse1";
    private Characteristic character = new Characteristic("likes shees");
    private Description description = new Description("white color");

    public void eat() {
	System.out.println("Mouse1 eat()");
    }

    @Override
    public String toString() {
	return name;
    }
}

class Gerbil1 extends Rodent1 {
    private String name = "Gerbil1";
    private Characteristic character = new Characteristic("eats green plants");
    private Description description = new Description("grey color");

    public void eat() {
	System.out.println("Gerbil1 eat()");
    }

    @Override
    public String toString() {
	return name;
    }

}

class Hamster1 extends Rodent1 {
    private String name = "Hamster1";
    private Characteristic character = new Characteristic("eats seeds");
    private Description description = new Description("small ears");

    public void eat() {
	System.out.println("Hamster1 eat()");
    }

    @Override
    public String toString() {
	return name;
    }

}

class Characteristic {
    private String str;

    public Characteristic(String str) {
	this.str = str;
	System.out.println("Creatig characteristic: " + str);
    }

    public void dispose() {
	System.out.println("dsiposing characteristic: " + str);
    }

}

class Description {
    private String str;

    public Description(String str) {
	this.str = str;
	System.out.println("creating descriptoin: " + str);
    }

    public void dispose() {
	System.out.println("disposing description: " + str);
    }
}

public class Exercise12and14 {

    /**
     * @param args
     */

    public static void main(String[] args) {
	int size = 4;
	Mouse1 mouse = new Mouse1();
	Rodent1[] arrRodent = new Rodent1[size];
	arrRodent[0] = new Rodent1();
	arrRodent[1] = new Mouse1();
	arrRodent[2] = new Gerbil1();
	arrRodent[3] = new Hamster1();
	System.out.println(Arrays.toString(arrRodent));
	// Exercie14
	mouse.shared.addRef();
    }
}
