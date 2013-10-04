/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */
public class Example12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int a = -1;
	System.out.println(Integer.toBinaryString(a));
	a <<= 10;
	System.out.println(Integer.toBinaryString(a));
	for (int i = 0; i < 32; i++) {
	    a >>>= 1;
	    System.out.println(Integer.toBinaryString(a));
	}

    }

}
