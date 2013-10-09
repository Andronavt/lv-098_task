/**
 * 
 */
package controllingExecution;

/**
 * @author orecto
 * 
 */
public class Exercise5 {
	public static void main(String[] args) {
		int i1 = 0b1010101010;
		int i2 = 0b0101011101;

		System.out.println("i1 => " + Integer.toBinaryString(i1));
		System.out.println("i2 => " + Integer.toBinaryString(i2));
		System.out.println("i1 & i2 => " + Integer.toBinaryString(i1 & i2));
		System.out.println("i1 | i2 => " + Integer.toBinaryString(i1 | i2));
		System.out.println("i1 ^ i2 => " + Integer.toBinaryString(i1 ^ i2));
		System.out.println("~i2 => " + Integer.toBinaryString(~i2));
	}

}

/*
 * Repeat Exercise 10 from the previous chapter, using the ternary operator and
 * a bitwise test to display the ones and zeroes, instead of
 * Integer.toBinaryString( ).
 */
