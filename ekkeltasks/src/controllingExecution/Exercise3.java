/**
 * 
 */
package controllingExecution;

import java.util.Random;

/**
 * @author Andrew
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void compRandom() {
	Random random = new Random();
	int previous = random.nextInt(25);
	int current = 0;
	while (true) {
	    current = random.nextInt(25);
	    if (current > previous) {
		System.out.println(current + " greater than " + previous);
	    } else if (current == previous) {
		System.out.println(current + " equal " + previous);
	    } else {
		System.out.println(current + " less than " + previous);
	    }
	    previous = current;
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise3.compRandom();
    }

}
