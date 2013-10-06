package ControllingExecution;

import java.util.Random;

//Modify exercise 2 so that your code is surrounded by an "infinte" while loop. 
//It will then run until you interrupt it from the keyboard (typically by Control-C)

/**
 * @author nazarko
 * 
 */
public class Ex_3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_3");
		Random r_1 = new Random();
		Random r_2 = new Random();
		while (true) {
			int x = r_1.nextInt(10);
			int y = r_2.nextInt(10);
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			if (x < y)
				System.out.println("x < y");
			else if (x > y)
				System.out.println("x > y");
			else
				System.out.println("x = y");
			System.out.println("\nnext comparison");
		}
	}

}

// public class CompareIntsForever {
// public static void main(String[] args) {
// Random rand1 = new Random();
// Random rand2 = new Random();
// for(int i = 0; i < 25; i++) {
// int x = rand1.nextInt();
// int y = rand2.nextInt();
// if(x < y) print(x + " < " + y);
// else if(x > y) print(x + " > " + y);
// else print(x + " = " + y);
// }
// }