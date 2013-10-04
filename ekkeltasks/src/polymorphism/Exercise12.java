/**
 * 
 */
package polymorphism;

/**
 * @author Andrew
 *   Exercise 14 here too.
 */
class Rodent1 {
    Rodent1() {
	System.out.println("Constructor Rodent1");
    }

    void eat() {
	System.out.println("Rodent eat");
    }

    void run() {
	System.out.println("Rodent run");
    }

    void sleep() {
	System.out.println("Rodent sleep");
    }
}

class Mouse1 extends Rodent1 {
    Mouse1() {
	System.out.println("Constructor Mouse1");
    }

    void eat() {
	System.out.println("Mouse eat");
    }

    void run() {
	System.out.println("Mouse run");
    }

    void sleep() {
	System.out.println("Mouse sleep");
    }
}

class Gerbil1 extends Rodent1 {
    Gerbil1() {
	System.out.println("Constructor Gerbil1");
    }

    void eat() {
	System.out.println("Gerbil eat");
    }

    void run() {
	System.out.println("Gerbil run");
    }

    void sleep() {
	System.out.println("Gerbil sleep");
    }
}

class Hamster1 extends Rodent1 {
    Hamster1() {
	System.out.println("Constructor Hamster1");
    }

    void eat() {
	System.out.println("Hamster eat");
    }

    void run() {
	System.out.println("Hamster run");
    }

    void sleep() {
	System.out.println("Hamster sleep");
    }
}

public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("---------");
	Rodent1[] rodent = new Rodent1[] { new Hamster1(), new Gerbil1(),
		new Mouse1() };
	for (Rodent1 r : rodent) {
	    r.eat();
	    r.run();
	    r.sleep();
	}

    }

}
