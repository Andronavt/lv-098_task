package eckel.operators;

/*
 * Write a program that simulates coin-flipping
 */

import java.util.Random;

public class CoinFlipping {
    static Random rand = new Random();

    public String coint(int flip) {
	if (flip == 0) {
	    return "heads";
	}
	return "tails";
    }

    public static void main(String[] args) {
	System.out.println(new CoinFlipping().coint(rand.nextInt(2)));
    }

}
