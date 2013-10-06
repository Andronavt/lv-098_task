/**
 * Exercise 20:   (2) Create a class that contains int, long, float and double and String 
 * fields. Create a constructor for this class that takes a single String argument, and scans that 
 * string into the various fields. Add a toString( ) method and demonstrate that your class 
 * works correctly. 
 */
package Strings12;

import java.util.Scanner;

/**
 * @author Богдан
 * 
 */
public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(new Test20("5 17 5,55555 TEXT"));

    }

}

class Test20 {
    private int i;
    private long l;
    private double d;
    private String s;

    Test20(String s) {
	Scanner scan = new Scanner(s);
	i = scan.nextInt();
	l = scan.nextLong();
	d = scan.nextDouble();
	this.s = scan.next();
    }

    public String toString() {
	return i + " " + l + " " + d + " " + s;
    }
}
