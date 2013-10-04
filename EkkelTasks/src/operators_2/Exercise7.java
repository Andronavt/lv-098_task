/**
 * 
 */
package operators_2;

import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("Coinflip of 10 times is:");
	for (int i = 0; i < 10; i++) {
	    System.out.println(coinFlip());
	}
    }

    public static String coinFlip() {
	Random rand = new Random();
	return (rand.nextBoolean() ? "eagle" : "tails");
    }
}
