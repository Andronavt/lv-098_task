/**
 * Exercise 27:   (1) Modify Exercise 3 to convert the exception to a RuntimeException. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 *
 */
public class Exercise27 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    int[] array = new int[2];
	    array[3] = 1;
	} catch (RuntimeException e) {
	    e.printStackTrace();
	}
    }

}
