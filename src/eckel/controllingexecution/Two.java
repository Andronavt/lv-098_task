package eckel.controllingexecution;

import java.util.Random;

/*
 * Write a program that generates 25 random int values.For each values, use an if-else statement
 * to classify it as greater than, less than, or equals to a second randomly generated values.
 */
/*
 * Modify Exercise 2 so that your code is surrounded by an "infinite" while loop.It will then run until 
 * you interrupt it from the keyboard.
 */
public class Two {
    static Random rand = new Random();

    public static void main(String[] args) {
	int[] arr = new int[25];
	while (true) {
	    for (int i = 0; i < arr.length; i++) {
		arr[i] = rand.nextInt();
		if (i == 24)
		    break;
		if ((arr[i] > arr[i + 1]) || (arr[i] < arr[i + 1])) {
		    System.out.println("one of condition true: " + arr[i]);
		} else {
		    System.out.println("equals: " + arr[i]);
		}
	    }
	}
    }
}
