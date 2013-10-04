/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
public class Exercise3 {
	public static void main(String[] args) {
		Deriverd deriverd = new Deriverd();
		deriverd.print();
	}
}

abstract class Base {
	abstract void print();
}

class Deriverd extends Base {
	int i = 5;

	/**
	 * 
	 */
	public Deriverd() {
		print();
	}

	@Override
	void print() {
		System.out.println("Deriverd.print() -> " + i);
	}
}
/*
 * Create a base class with an abstract print( ) method that is overridden in a
 * derived class. The overridden version of the method prints the value of an
 * int variable defined in the derived class. At the point of definition of this
 * variable, give it a nonzero value. In the base-class constructor, call this
 * method. In main( ), create an object of the derived type, and then call its
 * print( ) method. Explain the results.
 */