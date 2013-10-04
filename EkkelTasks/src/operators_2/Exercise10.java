/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise10 {
    static int arg1;
    static int arg2;

    /**
     * @param args
     */
    public static void main(String[] args) {
	arg1 = 0x0101;
	arg2 = 0x0110;
	System.out.println("AND operaration for 0x0101 and 0x0110 is :" + Integer.toBinaryString(arg1 & arg2));
	System.out.println("OR operaration for 0x0101 and 0x0110 is :" + Integer.toBinaryString(arg1 | arg2));
	System.out.println("XOR operaration for 0x0101 and 0x0110 is :" + Integer.toBinaryString(arg1 ^ arg2));
	
    }
}
