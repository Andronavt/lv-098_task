/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class Game {
    Game(int i) {

	System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
	super(i);
	System.out.println("BoardGame constructor");
    }
}

public class Example6 extends BoardGame {

    Example6() {
	super(11);
	System.out.println("Chess constructor");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Example6 x = new Example6();
    }

}
