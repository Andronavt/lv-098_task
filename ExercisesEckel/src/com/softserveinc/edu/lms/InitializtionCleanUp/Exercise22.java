/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise22 {
   private static MONEY money;

    /**
     * @param args
     */
    public static void main(String[] args) {
	MONEY money = MONEY.DOLLAR;
	switch (money) {
	case DOLLAR:
	    System.out.println("USA currency");
	    break;
	case GRN:
	    System.out.println("Ukraine currency");	    
	    break;
	case RUB:
	    System.out.println("Russian currency");
	    break;
	case KORUNA:
	    System.out.println("Czech republic currency");
	    break;
	case EURO:
	    System.out.println("EU currency");
	    break;
	case POUND:
	    System.out.println("Great Britain currency");
	    break;
	default:
	    System.out.println("No such currency");
	    break;
	}
    }
}
