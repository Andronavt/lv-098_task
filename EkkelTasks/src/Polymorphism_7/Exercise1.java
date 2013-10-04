/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Cycle obj1 = new Unicycle();
	Cycle obj2 = new Bicycle();
	Cycle obj3 = new Tricycle();
	obj1.ride();
	obj2.ride();
	obj3.ride();
    }

}

class Cycle {
    void ride() {
	System.out.println("Cycle");
    }
}

class Unicycle extends Cycle {
    void ride() {
	System.out.println("Unicycle");
    }
}

class Bicycle extends Cycle {
    void ride() {
	System.out.println("Bycycle");
    }
}

class Tricycle extends Cycle {
    void ride() {
	System.out.println("Tricycle");
    }
}
