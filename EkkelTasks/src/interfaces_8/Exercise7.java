/**
 * 
 */
package interfaces_8;



/**
 * @author Богдан
 * 
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Rodent2[] array = new Rodent2[] { new Gerbil2(), new Humste2(),
		new Mouse2() };
	for (Rodent2 r : array) {
	    r.drink();
	    r.eat();
	}

    }

}

interface Rodent2 {
    void eat();

    void drink();
}

class Mouse2 implements Rodent2 {
    @Override
    public void eat() {
	System.out.println("Mouse eat food");
    }

    @Override
    public void drink() {
	System.out.println("Mouse drink water");
    }
}

class Gerbil2 implements Rodent2 {
    @Override
    public void eat() {
	System.out.println("Gerbil eat food");
    }

    @Override
    public void drink() {
	System.out.println("Gerbil drink  water");
    }
}

class Humste2 implements Rodent2 {
    @Override
    public void eat() {
	System.out.println("Humster eat food");
    }

    @Override
    public void drink() {
	System.out.println("Humster drink  water");
    }
}
