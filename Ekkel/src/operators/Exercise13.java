/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise13 {
	public static void main(String[] args) {
		char ch1 = 's';
		char ch2 = 'a';
		char ch3 = 'd';

		charToBin(ch1);
		charToBin(ch2);
		charToBin(ch3);
	}

	public static void charToBin(char ch) {
		String str = "char: " + ch + " => bin: ";
		System.out.println(str + Integer.toBinaryString(ch));
	}
}

/*
 * Write a method that displays char values in binary form. Demonstrate it using
 * several different characters.
 */
