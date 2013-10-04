/**
 * 
 */
package Operators;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Oleg
 * 
 */
class Coin {
    static int Heads = 0;
    static int Tails = 0;

    void flip() {
	Random toss = new Random();
	int side = toss.nextInt(2);
	if (side == 0) {
	    System.out.println("You tossed Head");
	    Heads++;
	} else {
	    System.out.println("You tossed Tail");
	    Tails++;
	}

    }

    void showResults() {
	System.out.println("Heads :" + Heads + " Tails: " + Tails);
    }
}

public class Example7 {

    /**
     * @param args
     */

    public static void main(String[] args) {
	Coin a = new Coin();
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	String pressed;
	System.out.println("Press enter to toss ");
	System.out.println("To exit enter \"end\"");
	while (true) {
	    pressed = in.nextLine();
	    if (pressed.equals("")) {
		a.flip();
	    } else {
		a.showResults();
		break;
	    }
	}
    }

}
