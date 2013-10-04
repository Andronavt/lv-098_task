/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 *
 */
import java.util.Random;

interface Toss {
    void tossing();

}

interface TossFactory {
    Toss getToss();
}

class Coin implements Toss {
    public void tossing() {
	Random k = new Random();
	System.out.print("Coin tossing = ");
	switch(k.nextInt(3)+1)
	{
	case 1: System.out.println("Head");
	break;
	case 2: System.out.println("Tail");
	break;
	case 3: System.out.println("Edge");
	break;
	}
    }
}

class CoinFactory implements TossFactory {
    public Toss getToss() {
	return new Coin();
    }
}

class Dice implements Toss {
    @Override
    public void tossing() {
	Random k = new Random();
	System.out.println("Dice tossing = " + (k.nextInt(6) + 1));
    }
}

class DiceFactory implements TossFactory {
    public Toss getToss() {
	return new Dice();
    }
}

public class Exercise19 {

    /**
     * @param args
     */
    public static void toss(TossFactory tossFactory) {
	Toss k = tossFactory.getToss();
	k.tossing();
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	toss(new DiceFactory());
	toss(new CoinFactory());
    }

}

