/**
 * 
 */
package controllingExecution;

/**
 * @author orecto
 * 
 */
public class Exercise4 {
	public static void main(String[] args) {
		PrimeNumber.primeNumber(2, 500000);
	}

}

class PrimeNumber {
	public static void primeNumber(int from, int to) {
		if ((from > to) || (from <= 1)) {
			System.out.println("IllegalArgumentException ;)");
			return;
		}

		for (int i = from; i < to; i++) {
			int j = 2;
			boolean flag = true;
			for (; j < to; j++) {
				if ((i % j == 0) && (i != j)) {
					flag = false;
					break;
				}
				if (j == to - 1 && flag) {
					System.out.println(i);
				}
			}
		}
	}
}
