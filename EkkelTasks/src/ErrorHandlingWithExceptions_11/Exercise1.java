/**
 * Exercise 1:   (2) Create a class with a main( ) that throws an object of class Exception 
 * inside a try block. Give the constructor for Exception a String argument. Catch the 
 * exception inside a catch clause and print the String argument. Add a finally clause and 
 * print a message to prove you were there.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    throw new Exception("Error!!!");
	} catch (Exception e) {
	    e.printStackTrace(System.err);
	} finally {
	    System.out.println("Program works");
	}

    }

}
