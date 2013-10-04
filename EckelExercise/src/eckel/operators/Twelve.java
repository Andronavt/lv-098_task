package eckel.operators;

/*
 * Start with a number that is all binary ones.Left shift it, then use the unsigned right-shift operator to  
 * right shift through all of its binary positions, each time displaying the result using 
 * Integer.toBinaryString().
 * 
 */
public class Twelve {
    private static int CONST = 0x1111;

    public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	    CONST <<= i;
	    CONST >>>= i;
	    System.out.println(i + " : " + Integer.toBinaryString(CONST));
	}
    }
}
