package eckel.errorhandling;

/*
 * ex 30
 * modify Human.java so that the exceptions inherit from RUntimeException. Modify main() so that the technique in 
 * TUrnOffChecking.java is used to handle the different types of exceptions.
 */

class A30 extends RuntimeException {
}

class B30 extends A30 {
}

class GenerateException {
    void generate(int type) {
	try {
	    switch (type) {
	    case (0):
		throw new A30();
	    case (1):
		throw new B30();
	    case (2):
		throw new RuntimeException("WHAT?");
	    }
	} catch (Exception e) {
	    throw new RuntimeException(e);
	}
    }
}

public class Thirty {
    public static void main(String[] args) {
	GenerateException g = new GenerateException();
	for (int i = 0; i < 3; i++) {
	    try {
		if (i < 3)
		    g.generate(i);
		else
		    throw new RuntimeException();
	    } catch (RuntimeException re) {
		try {
		    throw re.getCause();
		} catch (B30 b) {
		    System.out.println("B30: " + b);
		} catch (A30 a) {
		    System.out.println("A30: " + a);
		} catch (Throwable t) {
		    System.out.println("Throwable: " + t);
		}
	    }
	}
    }

}
