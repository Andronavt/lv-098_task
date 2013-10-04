/**
 * 
 */
package operators;

import java.util.Random;

/**
 * @author orecto
 * 
 */
public class Exercise7 {
	public static void main(String[] args) {
		CoinFlipping cf = new CoinFlipping();
		for (int i = 0; i < 10; i++) {
			System.out.println("attempt " + i + " " + cf.toss());
		}
	}

}

class CoinFlipping {
	public String toss() {
		Random random = new Random();
		boolean b = random.nextBoolean();
		return b ? "reverse" : "averse";
	}
}
