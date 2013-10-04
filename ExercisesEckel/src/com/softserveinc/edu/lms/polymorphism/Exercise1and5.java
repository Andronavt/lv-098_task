/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

/**
 * @author Maryan
 * 
 */

class Cycle {
    public void ride() {
	System.out.println("ride()");
	wheels();
    }
   //Exercise5 
    public void wheels() {
	System.out.println("wheels()");
    }
}

class Unicycle extends Cycle {

}

class Bicycle extends Cycle {

}

class Tricycle extends Cycle {

}

public class Exercise1and5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Cycle c1 = new Unicycle();
	Cycle c2 = new Bicycle();
	Cycle c3 = new Tricycle();
	
	c1.ride();
	c2.ride();
	c3.ride();
    }

}
