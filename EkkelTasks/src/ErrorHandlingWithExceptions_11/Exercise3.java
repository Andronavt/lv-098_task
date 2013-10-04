/**
 * Exercise 3:   (1) Write code to generate and catch an 
 * ArraylndexOutOfBoundsException.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    int[] array = new int[2];
	    array[3] = 1;
	} catch (ArrayIndexOutOfBoundsException e) {
	    e.printStackTrace();
	}
    }

}
