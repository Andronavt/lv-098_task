/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

/**
 * @author Maryan
 *
 */
class Meal {
    public Meal () {
	System.out.println("Meal()");
    }
}

class Bread {
    public Bread () {
	System.out.println("Bread()");
    }
}

class Cheese {
    public Cheese() {
	System.out.println("Cheese()");
    }
}

class Lettuce {
    public Lettuce() {
	System.out.println("Lettuce()");
    }
}

class Pickle {
    public Pickle() {
	System.out.println("Pickle()");
    }
}

class Lunch extends Meal {
    public Lunch() {
	System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    public PortableLunch() {
	System.out.println("PortableLunch()");
    }
}

class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese ch = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich () {
	System.out.println("Sandwich()");
    }
}

public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Sandwich();
    }

}
