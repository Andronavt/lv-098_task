/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sandwich.main(args);

    }

}

class Meal {
    Meal() {
	System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
	System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
	System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
	System.out.println("Lettuce()");
    }
}
class Pickle {
    public Pickle() {
	System.out.println("Pickle()");
    }
}
class Lunch extends Meal {
    Lunch() {
	System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
	System.out.println("PortableLunch()");
    }
}

class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
	System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
	new Sandwich();
    }
}
