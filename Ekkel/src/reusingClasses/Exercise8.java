/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise8 {
	public static void main(String[] args) {
		Derived d = new Derived();
		d = new Derived("OrestO");
	}
}

class Base {
	public Base(String str) {
		System.out.println(str);
	}
}

class Derived extends Base {
	public Derived() {
		super("Orest");
	}

	public Derived(String str) {
		super(str);
	}
}
/*
 * Create a base class with only a non-default constructor, and a derived class
 * with both a default (no-arg) and non-default constructor. In the
 * derived-class constructors, call the base-class constructor.
 */
