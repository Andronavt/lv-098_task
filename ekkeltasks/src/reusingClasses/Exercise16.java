/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class Amphibian {
    void first() {
	System.out.println("first");
    }

    void second() {
	System.out.println("second");
    }

    void third() {
	System.out.println("third");
    }
}

class Frog extends Amphibian {
    void first() {
	System.out.println("Frog method - first");
    }

    void second() {
	System.out.println("Frog method - second");
    }

    void third() {
	System.out.println("Frog method - third");
    }

}

public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Amphibian frog = new Frog();
	frog.first();
	frog.second();
	frog.third();

    }

}
