/**
 * Exercise 18:   (3) Add a second level of exception loss to LostMessage.java so that the 
 * HoHumException is itself replaced by a third exception.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	LostMessage.main(args);

    }

}

class VeryImportantException extends Exception {
    public String toString() {
	return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
	return "A trivial exception";
    }
}

class ThirdException extends Exception {
    public String toString() {
	return "A third exception";
    }
}

class LostMessage {
    void f() throws VeryImportantException {
	throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
	throw new HoHumException();
    }

    void test() throws ThirdException {
	throw new ThirdException();
    }

    public static void main(String[] args) {
	try {
	    LostMessage lm = new LostMessage();
	    try {
		try {

		    lm.f();
		} finally {
		    lm.dispose();
		}
	    } finally {
		lm.test();
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
