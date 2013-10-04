/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 *
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Cycle2 obj1 = new Unicycle2();
	Cycle2 obj2 = new Bicycle2();
	Cycle2 obj3 = new Tricycle2();
	obj1.ride();
	obj2.ride();
	obj3.ride();
    }

}

class Cycle2 {
    
    void ride() {
	System.out.println("Cycle2");
    }
}

class Unicycle2 extends Cycle2 {
    @Override
    void ride() {
	System.out.println("Unicycle2");
    }
}

class Bicycle2 extends Cycle2 {
    @Override
    void ride() {
	System.out.println("Bycycle2");
    }
}

class Tricycle2 extends Cycle2 {
    @Override
    void ride() {
	System.out.println("Tricycle2");
    }
}

