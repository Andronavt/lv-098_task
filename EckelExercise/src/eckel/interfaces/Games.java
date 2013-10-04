package eckel.interfaces;

import java.util.Random;

/*
 * ex 19
 */

interface Game {
    void play();
}

interface GamesFactory {
    Game getGames();
}

class CoinToss implements Game {
    Random rand = new Random();

    public void play() {
	System.out.println("Toss Coin: ");
	switch (rand.nextInt(2)) {
	case 0:
	    System.out.println("Heads");
	    return;
	case 1:
	    System.out.println("Tails");
	    return;
	default:
	    System.out.println("OnEdge");
	    return;
	}
    }
}

class CoinTossFactory implements GamesFactory {
    public Game getGames() {
	return new CoinToss();
    }
}

class DiceToss implements Game {
    Random rand = new Random();

    public void play() {
	System.out.print("Throw Dice: " + (rand.nextInt(6) + 1));
    }
}

class DiceTossFactory implements GamesFactory {
    public Game getGames() {
	return new DiceToss();
    }
}

public class Games {
    public static void playGame(GamesFactory factory) {
	Game g = factory.getGames();
	g.play();
    }

    public static void main(String[] args) {
	playGame(new CoinTossFactory());
	playGame(new DiceTossFactory());
    }
}
