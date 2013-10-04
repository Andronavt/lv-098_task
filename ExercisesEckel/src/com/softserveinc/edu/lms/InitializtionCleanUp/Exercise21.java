/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise21 {
    MONEY money;

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (MONEY currency : MONEY.values()) {
	    System.out.println("Paper currency : " + currency
		    + "\t ordinal = " + currency.ordinal());
	}

    }

}