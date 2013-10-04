/**
 * 
 */
package initializationAndClining_4;

import java.util.Arrays;

/**
 * @author Богдан
 *
 */
public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int n;
	n= 10;
	String [] array = new String[n];
	Arrays.fill(array, "test");
	for (String i : array){
	    System.out.print("["+i+"] ");
	}

    }

}
