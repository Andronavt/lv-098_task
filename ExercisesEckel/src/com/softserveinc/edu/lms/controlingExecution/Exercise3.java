/**
 * 
 */
package com.softserveinc.edu.lms.controlingExecution;

import java.util.Random;

/**
 * @author Maryan
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Random rand = new Random();
	int randomNumber1 = rand.nextInt();
	int randomNumber2 = randomNumber1;
	while (true) {
	    randomNumber1 = rand.nextInt();
	    if (randomNumber1 > randomNumber2) {
		System.out.println(randomNumber1 + " > " + randomNumber2);
	    } else if (randomNumber1 < randomNumber2) {
		System.out.println(randomNumber1 + " < " + randomNumber2);
	    } else {
		System.out.println(randomNumber1 + " = " + randomNumber2);
	    }
	    randomNumber2 = randomNumber1;
	}
    }
}