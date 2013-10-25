package eckel.strings;

/*
 * ex 6
 * create a class that contains int, long. float and double fields. Create a toString() method for this class that uses
 * String.format() , and demonstrate that your class works correctly.
 */

public class Six {
    private int i = 1;
    private long l = 2;
    private float f = 1f;
    private double d = 1.1;

    public String toString() {
	return String.format("i = %d\nl = %d\nf = %.12g\nd = $.12g\n", i, l, f,
		d);
    }

    public static void main(String[] args) {
	System.out.println(new Six());
    }

}
