/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

/**
 * @author Maryan
 *
 */

class Cycle1 {
    public void ride() {
	System.out.println("ride()");
    }
}

class Unicycle1 extends Cycle1 {

    public void balance() {
	System.out.println("Unicycle1.balance()");
    }
}

class Bicycle1 extends Cycle1 {
    
    public void balance() {
	System.out.println("Bicycle1.balance()");
    }

}

class Tricycle1 extends Cycle1 {

}

public class Exercise17 extends Cycle1{
    private static Cycle1[] arr = {new Unicycle1(), new Bicycle1(), new Tricycle1()};
    /**
     * @param args
     */
    
    public static void main(String[] args) {
	/*for (Cycle1 c: arr) {
	    c.balance(); // Неможливо викликати мето balance();
	} */

	Unicycle1 u = new Unicycle1();
	u.balance();
	Bicycle1 b = new Bicycle1();
	b.balance();
    }
}
