/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Andrew
 * 
 */
/*
 * (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator
 * instead of a Selector.
 */
class Rodent {

    void eat() {
	System.out.println("Rodent eat");
    }

    void run() {
	System.out.println("Rodent run");
    }
  void sleep() {
	System.out.println("Rodent sleep");
    }

    Rodent randRodent() {
	Random random = new Random();
	switch (random.nextInt(3)) {
	case 0:
	    return new Mouse();
	case 1:
	    return new Gerbil10();
	default:
	    return new Hamster();
	}
    }
}

class Mouse extends Rodent {
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

class Gerbil10 extends Rodent {
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

class Hamster extends Rodent {
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

public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Rodent> rodent = new ArrayList<Rodent>();
	Iterator<Rodent> iterator;
	for (int i = 0; i < 15; i++) {
	    rodent.add(new Rodent().randRodent());
	}
	iterator = rodent.iterator();
	while (iterator.hasNext()) {
	    Rodent s = iterator.next();
	    s.eat();
	    s.run();
	    s.sleep();
	}

    }

}
