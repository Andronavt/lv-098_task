/**
 * 
 */
package interfaces_8;

import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise19 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (int i = 0; i < 20; i++) {
	    gameConsumer(new CoinFactory());
	}
	for (int i = 0; i < 20; i++) {
	    gameConsumer(new DiceFactory());
	}

    }

    public static void gameConsumer(GameFactory gf) {
	Game g = gf.getGame();
	g.toss();
    }

}

interface Game {
    void toss();
}

interface GameFactory {
    Game getGame();
}

class CoinToss implements Game {
    @Override
    public void toss() {
	Random rand = new Random();
	if (rand.nextBoolean()) {
	    System.out.println("Coin toss: Eagle");
	} else {
	    System.out.println(" Coin toss: Tails");
	}
    }
}

class DiceToss implements Game {
    @Override
    public void toss() {
	Random rand = new Random();
	switch (rand.nextInt(5)) {
	case 0:
	    System.out.println("Dise toss: 1");
	    break;
	case 1:
	    System.out.println("Dise toss: 2");
	    break;
	case 2:
	    System.out.println("Dise toss: 3");
	    break;
	case 3:
	    System.out.println("Dise toss: 4");
	    break;
	case 4:
	    System.out.println("Dise toss: 5");
	    break;
	case 5:
	    System.out.println("Dise toss: 6");
	default:
	    break;
	}

    }
}

class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
	return new CoinToss();
    }
}

class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
	return new DiceToss();
    }
}
