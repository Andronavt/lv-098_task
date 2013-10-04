/**
 * Exercise 4:   (2) Create your own exception class using the extends keyword. Write a 
 * constructor for this class that takes a String argument and stores it inside the object with a
 * String reference. Write a method that displays the stored String. Create a try-catch clause 
 * to exercise your new exception.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    throw new Test4Exception("My ERROR!!!");
	} catch (Test4Exception e) {
	    e.what();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}

class Test4Exception extends Exception {
    String msg;

    public Test4Exception(String msg) {
	super(msg);
	this.msg = msg;
    }

    void what() {
	System.err.println("Message: "+ msg);
    }
}
