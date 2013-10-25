package eckel.strings;

import java.util.Scanner;

/*
 * ex 20
 * create a class that contains int,long,float and double and String fields.Create a constructor for this class that takes a single
 * String argument, and scans that string into the various fields. Add a toString() method and demonstrate that your class works correctly.
 */

public class Twenty {
    private int i;
    private float f;
    private long l;
    private double d;
    private String s;

    Twenty(String s) {
	Scanner scanner = new Scanner(s);
	i = scanner.nextInt();
	l = scanner.nextLong();
	d = scanner.nextDouble();
	f = scanner.nextFloat();
	this.s = scanner.next();
    }

    public String toString() {
	return i + " " + f + " " + l + " " + d + " " + s;
    }

    public static void main(String[] args) {
	Twenty t = new Twenty("12 32342 2.3 1.23434 hello");
	System.out.println(t);
    }

}
