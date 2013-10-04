/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 * 
 */
abstract class Rodent1 {

    abstract void eat();

    abstract void run();

    abstract void sleep();
}

class Mouse extends Rodent1 {
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

class Gerbil extends Rodent1 {
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

class Hamster extends Rodent1 {
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

public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rodent1[] rodent = new Rodent1[] { new Hamster(), new Gerbil(),
		new Mouse() };
	for (Rodent1 r : rodent) {
	    r.eat();
	    r.run();
	    r.sleep();
	}

    }

}
