/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 * 
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}

interface FastFood {
    void drink();

    void sweet();

    void chips();
}

class Meal {
    Meal() {
	System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
	System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
	System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
	System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
	System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
	System.out.println("PortableLunch()");
    }
}

class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
	System.out.println("Sandwich()");
    }

    @Override
    public void chips() {
	System.out.println("Fried chips");
    }

    @Override
    public void drink() {
	System.out.println("Hot Tea");

    }

    @Override
    public void sweet() {
	System.out.println("Make sweets");

    }

    public static void main(String[] args) {
	Sandwich s = new Sandwich();
	s.chips();
	s.drink();
	s.sweet();
    }
}