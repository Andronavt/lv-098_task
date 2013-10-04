package eckel.errorhandling;

/*
 * ex 21
 * Demonstrate that a derived-class constructor cannot catch exception thrown by its base-class constructor.
 */

class ConstructorException extends Exception {
}

class BaseA {
    BaseA() throws ConstructorException {
	throw new ConstructorException();
    }
}

class DerivedB extends A {
    DerivedB() throws ConstructorException {
	super();
    }
}

public class TwentyOne {
    public static void main(String[] args) {
	try {
	    DerivedB d = new DerivedB();
	} catch (ConstructorException ce) {
	    System.out.println(ce.getMessage());
	}
    }
}
