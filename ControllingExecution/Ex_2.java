package ControllingExecution;

import java.util.Random;

//Write a program that generates 25 random int values. For each value, use an
//if-else statement to classify it as greater than, less than or equal to a
//second randomly generated value.

/**
 * @author nazarko
 * 
 */
public class Ex_2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_2");
		Random r_1 = new Random();
		Random r_2 = new Random();
		for (int i = 0; i < 25; i++) {
			System.out.println((i+1) + " comparison");
			int x = r_1.nextInt();
			int y = r_2.nextInt();
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			if (x < y) {
				System.out.println("x < y");
			} else if (x > y) {
				System.out.println("x > y");
			} else
				System.out.println("x = y");
			System.out.println();
		}
	}
}
