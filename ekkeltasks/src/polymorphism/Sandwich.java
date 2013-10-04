/**
 * 
 */
package polymorphism;

/**
 * @author Andrew
 * 
 */
interface FastFood
{
   void cheeseBurger();
   void gamburger();
   void fries();
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

class Pick {

}

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    
    @Override
    public void cheeseBurger() {
	// TODO Auto-generated method stub
	System.out.println("CheeseBurger");
	
    }

    @Override
    public void gamburger() {
	// TODO Auto-generated method stub
	System.out.println("Gamburger");
    }

    @Override
    public void fries() {
	// TODO Auto-generated method stub
	System.out.println("Fries");
    }

    public Sandwich() {
	System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
	new Sandwich();
    }
}
