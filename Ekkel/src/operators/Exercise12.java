/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise12 {
	public static void main(String[] args) {
		int i1 = 0b11111111111;
		System.out.println("i1 => " + Integer.toBinaryString(i1));

		System.out.println("i1 >>= 1 => " + Integer.toBinaryString(i1 <<= 1));

		for (int i = 0; i < 12; i++) {
			System.out.println("(" + (i + 1) + ")i1 >>>= 1 => "
					+ Integer.toBinaryString(i1 >>>= 1));
		}
	}

}
