/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
/*
 * Create a framework using Factory Methods that performs both coin tossing and
 * dice tossing
 */
public class Exercise19 {
	public static void play(GameFactory gf) {
		Game game = gf.getGame();
		game.play();
	}

	public static void main(String[] args) {
		play(new TossFactory());
		play(new DiceFactory());
	}
}

interface Game {
	void play();
}

interface GameFactory {
	Game getGame();
}

class Toss implements Game {
	public void play() {
		System.out.println("Toss");
	}
}

class Dice implements Game {
	public void play() {
		System.out.println("Dice");
	}
}

class TossFactory implements GameFactory {
	public Game getGame() {
		return new Toss();
	}
}

class DiceFactory implements GameFactory {
	public Game getGame() {
		return new Dice();
	}
}