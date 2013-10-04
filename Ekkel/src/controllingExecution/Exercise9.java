/**
 * 
 */
package controllingExecution;

/**
 * @author orecto
 * 
 */
public class Exercise9 {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		for (int i : fib.getSeries(10))
			System.out.print(i + " ");
	}

}

class Fibonacci {
	public int[] getSeries(int count) {
		int[] res = new int[count];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i < count; i++) {
			res[i] = res[i - 1] + res[i - 2];
		}
		return res;
	}
}
/*
 * A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
 * and so on, where each number (from the third on) is the sum of the previous
 * two. Create a method that takes an integer as an argument and displays that
 * many Fibonacci numbers starting from the beginning, e.g., If you run java
 * Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1,
 * 1, 2, 3, 5.
 */
