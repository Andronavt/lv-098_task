/**
 * Exercise 9:   (2) Create three new types of exceptions. Write a class with a method that
 * throws all three. In main( ), call the method but only use a single catch clause that will
 * catch all three types of exceptions.  
 */
package ErrorHandlingWithExceptions_11;

import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    throeEx();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    public static void throeEx() throws Exercise9Ex_1, Exercise9Ex_2,
	    Exercise9Ex_3 {
	Random rand = new Random();
	switch (rand.nextInt(2)) {
	case 0:
	    throw new Exercise9Ex_1("Message Exercise9Ex_1");

	case 1:
	    throw new Exercise9Ex_2("Message  Exercise9Ex_2");

	case 2:
	    throw new Exercise9Ex_3("Message  Exercise9Ex_3");

	}
    }

}

class Exercise9Ex_1 extends Exception {
    private String msg;

    public Exercise9Ex_1() {
    }

    public Exercise9Ex_1(String msg) {
	super(msg);
	this.msg = msg;
    }
}

class Exercise9Ex_2 extends Exception {
    private String msg;

    public Exercise9Ex_2() {
    }

    public Exercise9Ex_2(String msg) {
	super(msg);
	this.msg = msg;
    }
}

class Exercise9Ex_3 extends Exception {
    private String msg;

    public Exercise9Ex_3() {
    }

    public Exercise9Ex_3(String msg) {
	super(msg);
	this.msg = msg;
    }
}
