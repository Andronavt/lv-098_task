/**
 * 
 */

package polymorphism;

import static staticPack.StaticPrint.print;

class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

class Pickle {
	Pickle() {
		print("Pickle()");
	}
}

public class Exercise11 extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();

	public Exercise11() {
		print("Sandwich()");
	}

	public static void main(String[] args) {
		new Exercise11();
	}
}
/* Add class Pickle to Sandwich.java */