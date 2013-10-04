/**
 * 
 */
package controllingExecution_3;

import java.util.Arrays;

/**
 * @author Богдан
 * 
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	fob(10);

    }

    static void fob(int n) {
	if (n != 0) {
	    int[] array = new int[n];
	    if (n == 1) {
		array[0] = 1;
	    } else {
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
		    array[i] = array[i - 1] + array[i - 2];
		}
	    }
	    System.out.println(Arrays.toString(array));
	} else {
	    System.out.println(0);
	}
    }
}
