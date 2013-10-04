package eckel.operators;

/*
 * Start with a number that has a binary one in the most significant position.Using the signed right-shift
 * operator, right shift it all the way through all of its binary positions, each time displaying
 * the result using Integer.toBinaryString() 
 */
public class Eleven {
    private static int CONST = 0x0011;

    public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	    CONST >>= i;
	    System.out.println(i + " : " + CONST);
	}
    }

}
