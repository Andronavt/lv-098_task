/**
 * Exercise 6:   (2) Create a class that contains int, long, float and double fields. Create a 
 * toString( ) method for this class that uses String.format( ), and demonstrate that your 
 * class works correctly. 
 */
package Strings12;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {
    static int i = 10;
    static long l = 10000001L;
    static float f = 10.5F;
    static double d = 256.256;

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(new Exercise6().toString());

    }

    public String toString() {
	return String.format("%-5d", i) + String.format("%-10d", l)
		+ String.format("%-15f", f) + String.format("%-15f", f);
    }

}
