/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Богдан
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	List<Rodent3> list = new ArrayList<>();
	list.add(new Gerbil3());
	list.add(new Mouse3());
	list.add(new Humster3());
	Iterator<Rodent3> iter = list.iterator();
	while (iter.hasNext()) {
	    Rodent3 r = iter.next();
	    r.eat();
	    r.drink();
	}

    }
}

class Rodent3 {
    void eat() {
	System.out.println("Rodent eat food");
    }

    void drink() {
	System.out.println("Rodent drink wather");
    }
}

class Mouse3 extends Rodent3 {
    @Override
    void eat() {
	System.out.println("Mouse eat food");
    }

    @Override
    void drink() {
	System.out.println("Mouse drink wather");
    }
}

class Gerbil3 extends Rodent3 {
    @Override
    void eat() {
	System.out.println("Gerbil eat food");
    }

    @Override
    void drink() {
	System.out.println("Gerbil drink watherd");
    }
}

class Humster3 extends Rodent3 {
    @Override
    void eat() {
	System.out.println("Humster eat food");
    }

    @Override
    void drink() {
	System.out.println("Humster drink wather");
    }
}
