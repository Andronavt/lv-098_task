package ControllingExecution;
//Repeat Exercise 10 from the previous chapter, using the ternary operator 
//and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
/**
 * @author nazarko
 *
 */
public class Ex_5 {
	/**
	 * @param args
	 */
public static class BitTest {
	static void binary (int q) {
		if(q == 0) System.out.print(0);
		else {
			int a = Integer.numberOfLeadingZeros(q); 
			q <<= a;
			for(int p = 0; p < 32 - a; p++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				System.out.print(n);		
				q <<= 1;
			}		
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_5");
		int i = 555;
		int j = 1000;
		int k = 0x100;
		int m = 0;
		System.out.println("Integer.toBinaryString : ");
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("k = " + Integer.toBinaryString(k));
		System.out.println("m = " + Integer.toBinaryString(m));		
		System.out.println("i & j : " + (i & j) + " = " + Integer.toBinaryString(i & j));
		System.out.println("i | j : " + (i | j) + " = " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j : " + (i ^ j) + " = " + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
		System.out.println("binary : ");
		System.out.println("i = " + i + " = ");
		binary(i);		
		System.out.println("j = " + j + " = ");
		binary(j);
		System.out.println("k = " + k + " = ");
		binary(k);		
		System.out.println("m = " + m + " = ");
		binary(m);
		System.out.println("i & j : " + (i & j) + " = ");
		binary(i & j);
		System.out.println("i | j : " + (i | j) + " = ");
		binary(i | j);
		System.out.println("i ^ j : " + (i ^ j) + " = ");
		binary(i ^ j);
		System.out.println("~i = " + ~i + " = ");
		binary(~i);		
		System.out.println("~j = " + ~j + " = ");
		binary(~j);
	}	
	}
}

