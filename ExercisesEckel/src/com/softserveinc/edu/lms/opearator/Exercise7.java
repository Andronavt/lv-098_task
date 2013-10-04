/**
 * 
 */
package com.softserveinc.edu.lms.opearator;

import java.util.Random;

/**
 * @author Maryan
 * 
 */
public class Exercise7 {

    private boolean eagle = false;

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise7 ex = new Exercise7();
	ex.flipCoin();
    }

    public void flipCoin() {
	Random rand = new Random();
	eagle = rand.nextBoolean();
	if (eagle == false) {
	    System.out.println("Eagle");
	} else {
	    System.out.println("Tail");
	}
    }

}
