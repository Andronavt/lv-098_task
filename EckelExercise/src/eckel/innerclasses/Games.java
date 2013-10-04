package eckel.innerclasses;

import java.util.Random;

/*
 * 17
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

    public static GamesFactory gf = new GamesFactory() {

	@Override
	public Game getGames() {
	    // TODO Auto-generated method stub
	    return new CoinToss();
	}
    };
}

// class CoinTossFactory implements GamesFactory {
// public Game getGames() {
// return new CoinToss();
// }
// }

class DiceToss implements Game {
    Random rand = new Random();

    public void play() {
	System.out.print("Throw Dice: " + (rand.nextInt(6) + 1));
    }

    public static GamesFactory gf = new GamesFactory() {

	@Override
	public Game getGames() {
	    // TODO Auto-generated method stub
	    return new DiceToss();
	}
    };
}

// class DiceTossFactory implements GamesFactory {
// public Game getGames() {
// return new DiceToss();
// }
// }

public class Games {
    public static void playGame(GamesFactory factory) {
	Game g = factory.getGames();
	g.play();
    }

    public static void main(String[] args) {
	playGame(CoinToss.gf);
	playGame(DiceToss.gf);
    }
}
