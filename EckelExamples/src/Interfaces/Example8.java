package Interfaces;
/**
 * 
 */


/**
 * @author Oleg
 * 
 */
interface FastFood {
	void burger();
}

class Meal {
	Meal() {
		System.out.println("Meal()");
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

class Fastfood1 extends Lunch {
	Fastfood1() {
		System.out.println("Fastfood1()");
	}
}

public class Example8 extends Fastfood1 implements FastFood {
	private Cheese c = new Cheese();
	private Lunch l = new Lunch();
	public Example8() {
		System.out.println("Sandwich8()");
	}
	public void burger() {
		System.out.println("Cheeseburger");
	}
	public static void main(String[] args) {
		Example8 s = new Example8();
		s.burger();

	}
}