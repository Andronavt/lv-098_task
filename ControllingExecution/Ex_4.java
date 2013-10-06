package ControllingExecution;

//Write a program that uses two nested for loops and the modulus operator (%)
//to detect and print prime numbers.

/**
 * @author nazarko
 * 
 */
public class Ex_4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_4");
		for (int i = 1; i < 1000; i++) {
			int factors = 0;
			for (int j = 1; j < (i + 2) / 2; j++) {
				if ((i % j) == 0)
					factors++;
			}
			if (factors < 2)
				System.out.println(i + " is prime");
		}
	}
}