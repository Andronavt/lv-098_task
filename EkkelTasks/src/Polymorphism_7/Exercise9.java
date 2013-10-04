/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Rodent[] array = new Rodent[] { new Gerbil(), new Humster(),
		new Mouse() };
	for (Rodent r : array) {
	    r.drink();
	    r.eat();
	}
    }

}

class Rodent {
    void eat() {
	System.out.println("Rodent eat food");
    }

    void drink() {
	System.out.println("Rodent drink wather");
    }
}

class Mouse extends Rodent {
    @Override
    void eat() {
	System.out.println("Mouse eat food");
    }

    @Override
    void drink() {
	System.out.println("Mouse eat food");
    }
}

class Gerbil extends Rodent {
    @Override
    void eat() {
	System.out.println("Gerbil eat food");
    }

    @Override
    void drink() {
	System.out.println("Gerbil eat food");
    }
}

class Humster extends Rodent {
    @Override
    void eat() {
	System.out.println("Humster eat food");
    }

    @Override
    void drink() {
	System.out.println("Humster eat food");
    }
}