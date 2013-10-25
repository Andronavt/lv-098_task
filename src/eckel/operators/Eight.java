package eckel.operators;

/*
 * Show that hex and octal notations workd with long values.Use Long.toBInaryString() to display the results.
 */

public class Eight {

    public static void main(String[] args) {
	// int i = 0x2f;
	long l = 3L;
	System.out.println("long: " + Long.toBinaryString(l));
	System.out.println("long: " + Long.toHexString(l));
	System.out.println("long: " + Long.toOctalString(l));
    }

}
