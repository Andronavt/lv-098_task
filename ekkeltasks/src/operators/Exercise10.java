/**
 * 
 */
package operators;

/**
 * @author Andrew
 * 
 */
public class Exercise10 {
    public static void main(String[] args) {
	int i = 0x0120;
	System.out.println(i);
	int j = 0x0101;
	System.out.println(Integer.toBinaryString(i & j));
	System.out.println(Integer.toBinaryString(i | j));
	System.out.println(Integer.toBinaryString(i ^ j));
	System.out.println(Integer.toBinaryString(i << j));
	System.out.println(Integer.toBinaryString(i >> j));
    }

}
