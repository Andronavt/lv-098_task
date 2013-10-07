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
    private static Cycle1[] arr = new Cycle1[3];
    /**
     * @param args
     */
    
    public static void main(String[] args) {
	
	Cycle1 c1 = initUnicycle1();
	Cycle1 c2 = initBicycle1();
	Cycle1 c3 = initTricycle1();
	
	
	Unicycle1 u = new Unicycle1();
	u.balance();
	Bicycle1 b = new Bicycle1();
	b.balance();
	
	
    }
    
    public static Cycle1 initUnicycle1() {
	return arr[0] = new Unicycle1();
    }

    public static Cycle1 initBicycle1() {
	return arr[1] = new Bicycle1();
    }
    
    public static Cycle1 initTricycle1() {
	return arr[2] = new Tricycle1();
    }
}
