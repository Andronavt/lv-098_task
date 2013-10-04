package eckel.controllingexecution;

import java.util.Random;

/*
 * Write a program that uses two nested for loops and the modulus operator (%) to detect and print
 * prime numbers (integral numbers that are not evenly divisibe by any other number except for
 * themselves and 1). 
 */
public class Fourth {
    static Random rand = new Random();

    public static void main(String[] args) {
	int[][] arr = new int[5][5];
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < 5; j++) {
		arr[i][j] = rand.nextInt(100);
		if (arr[i][j] == 0)
		    continue;
		if ((arr[i][j] % arr[i][j] == 0) && (arr[i][j] % 1 == 0)) {
		    System.out.println(arr[i][j]);
		}
	    }
	}
    }

}
