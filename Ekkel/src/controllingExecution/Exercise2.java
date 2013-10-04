/**
 * 
 */
package controllingExecution;

import java.util.Random;

/**
 * @author orecto
 * 
 */
public class Exercise2 {
	public static void main(String[] args) {
		RandomCheck rc = new RandomCheck();
		rc.run();
	}

}

class RandomCheck {
	public void run() {
		Random random = new Random();
		int prev = random.nextInt();
		int curr;
		for (int i = 0; i < 24; i++) {
			curr = prev;
			prev = random.nextInt();
			System.out.println(checking(prev, curr));
		}
	}

	public String checking(int i1, int i2) {
		if (i1 > i2)
			return i1 + " is greater then " + i2;
		else if (i1 < i2)
			return i1 + " is less then " + i2;
		return i1 + " is equal to " + i2;
	}
}
