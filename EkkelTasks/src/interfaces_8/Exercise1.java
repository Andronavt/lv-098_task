/**
 * 
 */
package interfaces_8;


/**
 * @author Богдан
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Gerbil();
	new Mouse();
	new Humster();
	//new Rodent(); Can't to create an abstract class

    }

}

abstract class Rodent {
    abstract void eat();

    abstract void drink();

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