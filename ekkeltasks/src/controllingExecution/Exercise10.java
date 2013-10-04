/**
 * 
 */
package controllingExecution;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    /**
     * @param i1
     * @param j1
     * @return
     */
    public static boolean checkVamp(int i, int j) {
	char[] s = Integer.toString(i * j).toCharArray();
	char[] a = ((Integer.toString(i)) + Integer.toString(j)).toCharArray();
	Arrays.sort(s);
	Arrays.sort(a);
	return Arrays.equals(s, a);
    }

    public static void vampireNumbers() {
	for (int i = 11; i < 100; i++) {
	    for (int j = i; j < 100; j++) {
		if (i * j > 1000) {
		    if (checkVamp(i, j)) {
			System.out.print(i + "*" + j + " = ");
			System.out.println(i * j);
		    }

		}
	    }
	}

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise10.vampireNumbers();
    }

}
