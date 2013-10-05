/**
 * Exercise 19:   (2) Repair the problem in LostMessage.java by guarding the call in the 
 * finally clause.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise19 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    LostMessage lm = new LostMessage();
	    try {
		lm.f();
	    } catch (VeryImportantException e) {
		System.err.println(e);
	    } finally {
		lm.dispose();
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
