/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Modify the solution to Exercise 19 from the Interfaces chapter to use
 * anonymous inner classes
 */
public class Exercise17 {
	public static void play(GameFactory gf) {
		Game game = gf.getGame();
		game.play();
	}

	public static void main(String[] args) {
		play(Toss.factory);
		play(Dice.factory);
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
	
	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Toss();
		}
	};
}

class Dice implements Game {
	public void play() {
		System.out.println("Dice");
	}
	
	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Dice();
		}
	};
}
