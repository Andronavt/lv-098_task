package eckel.operators;

/*
 * Write a program with two constant values, one with alternating binary ones and zeroes, with a zero
 * in the least-significant digit, and the second, also alternating, with a one in the least-significant digit
 * (hint: It's easiest to use hexadecimal constants for this).Take these two values and combine them in all 
 * possible ways using the bitwise operators, and display the results using Integer.toBinaryString().
 */
public class Tenth {
    private static final int FIRST = 0x0110;
    private static final int SECOND = 0x0101;

    public static void main(String[] args) {
	System.out.println(Integer.toBinaryString(FIRST & SECOND));
	System.out.println(Integer.toBinaryString(FIRST | SECOND));
	System.out.println(Integer.toBinaryString(FIRST ^ SECOND));
	System.out.println(Integer.toBinaryString(~FIRST));
    }
}
  