/**Exercise 5:   (4) Repeat Exercise 10 from the previous chapter, using the ternary operator 
 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).  
 * 
 */
package controllingExecution_3;

/**
 * @author Богдан
 *
 */
public class Exercise5 {

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
