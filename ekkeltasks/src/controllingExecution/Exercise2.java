package controllingExecution;

import java.util.Random;

/**
 * @author Andrew
 * 
 */
public class Exercise2 {
    /**
     * @param args
     */
    public static void compRandom() {
	Random random = new Random();
	int previous = random.nextInt(25);
	int current = 0;
	for (int i = 0; i < 24; i++) {
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
	Exercise2.compRandom();
    }
}
