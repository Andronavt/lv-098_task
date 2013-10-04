/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */
public class Example11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int i = 0x10000000;
	System.out.println(Integer.toBinaryString(i));
	for (int n = 0; n < 28; n++) {
	    i >>>= 1;
	    System.out.println(Integer.toBinaryString(i));
	}

    }

}
