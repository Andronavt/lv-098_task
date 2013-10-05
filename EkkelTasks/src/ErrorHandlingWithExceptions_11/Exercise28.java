/**
 * Exercise 28:   (1) Modify Exercise 4 so that the custom exception class inherits from 
 * RuntimeException, and show that the compiler allows you to leave out the try block. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise28 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	throw new Test28Ex("My ERROR!!!");
    }

}

class Test28Ex extends RuntimeException {
    String msg;

    public Test28Ex(String msg) {
	super(msg);
	this.msg = msg;
    }

    void what() {
	System.err.println("Message: " + msg);
    }
}
