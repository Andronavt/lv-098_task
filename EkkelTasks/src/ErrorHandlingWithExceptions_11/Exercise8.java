/**
 * Exercise 8:   (1) Write a class with a method that throws an exception of the type created
 * in Exercise 4. Try compiling it without an exception specification to see what the compiler 
 * says. Add the appropriate exception specification. Try out your class and its exception inside 
 * a try-catch clause.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 *
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    throwEx("Throw Exception from Exercise 4!!!");
	} catch (Test4Exception e) {
	    e.printStackTrace();
	}

    }
    public static void throwEx(String s) throws Test4Exception{
	throw new Test4Exception(s);
    }

}
