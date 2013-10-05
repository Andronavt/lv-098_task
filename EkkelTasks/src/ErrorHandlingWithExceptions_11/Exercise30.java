/**
 * Exercise 30:   (2) Modify Human.java so that the exceptions inherit from 
 * RuntimeException. Modify main( ) so that the technique in TurnOffChecking.java is 
 * used to handle the different types of exceptions
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise30 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Human.main(args);

    }

}

class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

class Human {
    public static void main(String[] args) {
	WrapCheckedException wce = new WrapCheckedException();
	for (int i = 0; i < 3; i++) {
	    try {
		wce.throwRuntimeException(i);
	    } catch (Sneeze e) {
		System.out.println("Sneeze catched");
	    } catch (Annoyance e) {
		System.out.println("Annoyance catched");
	    } catch (RuntimeException e) {
		System.out.println("RuntimeException catched");
	    }
	}
    }
}

class WrapCheckedException {
    void throwRuntimeException(int type) {
	switch (type) {
	case 0:
	    throw new Sneeze();
	case 1:
	    throw new Annoyance();
	case 2:
	    throw new RuntimeException();
	default:
	    return;
	}

    }
}
