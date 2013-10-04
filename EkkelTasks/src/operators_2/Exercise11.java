/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise11 {

    static int arg;

    /**
     * @param args
     */
    public static void main(String[] args) {
	arg = 0x1000;
	while (arg != 0) {
	    System.out.println(Integer.toBinaryString(arg));
	    arg = arg >> 1;
	}
    }

}
