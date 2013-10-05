/**
 * Exercise 5:   (3) Create your own resumption-like behavior using a while loop that 
 * repeats until an exception is no longer thrown.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] array = new int[2];
	int i = 10;
	while (true) {
	    try {
		array[i] = 1;
		System.out.println("No error");
		break;
	    } catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		i--;
	    }
	}
	System.out.println("Program ends");
    }

}
