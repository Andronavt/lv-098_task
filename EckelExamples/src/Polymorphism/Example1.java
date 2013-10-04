/**
 * 
 */
package Polymorphism;

/**
 * @author Oleg
 * 
 */
class Cycle {
    private String name = "Cycle";
    public void wheels()
    {
	
    }

    public static void riding(Cycle c) {
	System.out.println("Cycle is riding " + c);
    }

    public String toString() {
	return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";

    public String toString() {
	return this.name;
    }
    public void wheels()
    {
	System.out.println("ONE");
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";

    public String toString() {
	return this.name;
    }
    public void wheels()
    {
	System.out.println("TWO");
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";

    public String toString() {
	return this.name;
    }
    public void wheels()
    {
	System.out.println("THREE");
    }
}

public class Example1 {
    public static void ride(Cycle c) {
	c.riding(c);
	c.wheels();
	
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Unicycle u = new Unicycle();
	Bicycle b = new Bicycle();
	Tricycle t = new Tricycle();

	ride(u);
	ride(b);
	ride(t);
    }

}
