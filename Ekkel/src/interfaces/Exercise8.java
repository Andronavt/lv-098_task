/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */

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

interface IFastfood{
	void getSandwitch();
}

public class Exercise8 extends PortableLunch implements IFastfood{
	private Bread b;
	private Cheese c;
	private Lettuce l;
	private Pickle p;
	
	public void getSandwitch(){
		print("befor new Exercise8().getSandwitch()");
		b = new Bread();
		c = new Cheese();
		l = new Lettuce();
		p = new Pickle();
		print("after new Exercise8().getSandwitch()");
	}
	

	public Exercise8() {
		print("Sandwich()");
	}

	public static void main(String[] args) {
		Exercise8 exercise8 = new Exercise8();
		print("befor new Exercise8().getSandwitch() in main");
		exercise8.getSandwitch();
		print("after new Exercise8().getSandwitch() in main");
	}
}
/*
 * In polymorphism.Sandwich.java, create an interface called FastFood (with
 * appropriate methods) and change Sandwich so that it also implements FastFood
 */