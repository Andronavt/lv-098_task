/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise10 {
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
