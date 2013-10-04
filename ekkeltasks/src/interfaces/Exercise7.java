/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 *
 */
interface Rodent11 {

    void eat();

    void run();

    void sleep();
}

class Mouse11 implements Rodent11 {
    public void eat() {
	System.out.println("Mouse eat");
    }

    public void run() {
	System.out.println("Mouse run");
    }

    public void sleep() {
	System.out.println("Mouse sleep");
    }
}

class Gerbil11 implements Rodent11 {
    public void eat() {
	System.out.println("Gerbil eat");
    }

    public void run() {
	System.out.println("Gerbil run");
    }

    public void sleep() {
	System.out.println("Gerbil sleep");
    }
}

class Hamster11 implements Rodent11 {
    public void eat() {
	System.out.println("Hamster eat");
    }

    public void run() {
	System.out.println("Hamster run");
    }

    public void sleep() {
	System.out.println("Hamster sleep");
    }
}
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rodent11[] rodent = new Rodent11[] { new Hamster11(), new Gerbil11(),
		new Mouse11() };
	for (Rodent11 r : rodent) {
	    r.eat();
	    r.run();
	    r.sleep();
	}

    }

}
