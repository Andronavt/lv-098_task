/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Cycle3 obj1 = new Unicycle3();
	Cycle3 obj2 = new Bicycle3();
	Cycle3 obj3 = new Tricycle3();
	obj1.ride();
	obj2.ride();
	obj3.ride();
    }

}

class Cycle3 {
    void ride() {
	System.out.println("Cycle3");
	wheel();
    }

    void wheel() {
	System.out.println("Wheels Cycle3");
    }

}

class Unicycle3 extends Cycle3 {
    void ride() {
	System.out.println("Unicycle3");
	wheel();

    }

    void wheel() {
	System.out.println("Unicycle3 have one wheel");
    }
}

class Bicycle3 extends Cycle3 {
    void ride() {
	System.out.println("Bycycle3");
	wheel();
    }

    void wheel() {
	System.out.println("Bicycle3 have two wheels");
    }
}

class Tricycle3 extends Cycle3 {
    void ride() {
	System.out.println("Tricycle3");
	wheel();
    }
    void wheel() {
	System.out.println("Tricycle3 have three wheels");
    }
}
