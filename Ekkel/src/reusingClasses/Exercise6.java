/**
 * 
 */
package reusingClasses;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 * 
 */
class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);// if comment you have error
		print("BoardGame constructor");
	}
}

public class Exercise6 extends BoardGame {
	Exercise6() {
		super(11);// if comment you have error
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Exercise6 x = new Exercise6();
	}
}
/* Using Chess.java, prove the statements in the previous paragraph */