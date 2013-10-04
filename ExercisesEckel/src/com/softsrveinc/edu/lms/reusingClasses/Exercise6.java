/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */

class Game {
    Game(int i) {
	System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    public BoardGame(int i) {
	super(i);
	System.out.println("BoardGame constructor");
    }

}

public class Exercise6 extends BoardGame {

    public Exercise6() {
	super(12); //клас Exercise6 використаний замість Chess 
	System.out.println("Exercise9 constructor");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise6 ex = new Exercise6();
    }

}
