/**
 * 
 */
package InnerClasses;

import java.util.Random;

/**
 * @author Oleg
 * 
 */
interface Game {
	void play();
}
interface GameFabric {
	Game getGame();
}
class Coin implements Game {
	Random rand = new Random();
	public void play() {
		switch (rand.nextInt(2)) {
			case 0 :
				System.out.println("Head");
			case 1 :
				System.out.println("Tail");
		}
	}
	public static GameFabric gameFabric = new GameFabric() {

		public Game getGame() {
			return new Coin();
		}
	};
}

class Dice implements Game {
	Random rand = new Random();
	public void play() {
		System.out.println(rand.nextInt(6));
	}
	public static GameFabric gameFabric = new GameFabric() {

		public Game getGame() {
			return new Dice();
		}
	};
}

public class Example17 {

	public static void playing(GameFabric games) {
		Game game = games.getGame();
		game.play();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		playing(Coin.gameFabric);
		playing(Dice.gameFabric);
	}

}
