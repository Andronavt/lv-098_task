/**
 * 
 */
package operators;

/**
 * @author Andrew
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int i = 0xFF;
	i = i << 1;
	while (i != 0) {
	    System.out.println(Integer.toBinaryString(i));
	    i = i >>> 1;
	}
    }

}
