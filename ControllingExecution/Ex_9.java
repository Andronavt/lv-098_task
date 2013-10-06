package ControllingExecution;

import java.util.Scanner;

//A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 
//34, and so on, where each number (from the third on) is the sum of the previous two. Create 
//a method that takes an integer as an argument and displays that many Fibonacci numbers 
//starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the 
//name of the class) the output will be: 1, 1, 2, 3, 5. 

/**
 * @author nazarko
 *
 */
public class Ex_9 {
	int fib(int n) {
		if(n < 2) return 1;
		return (fib(n - 2) + fib(n - 1));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_9");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k");
		int k = sc.nextInt();
		Ex_9 f = new Ex_9();
		System.out.println("1st " + k + " fibo : ");
		for(int i = 0; i < k; i++)
			System.out.println(f.fib(i));
	}
}

