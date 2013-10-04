/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise11 {
	public static void main(String[] args) {
		int i1 = 0b100011101;
		System.out.println("i1 => " + Integer.toBinaryString(i1));
		for (int i = 0; i < 9; i++) {
			System.out.println("(" + (i + 1) + ")i1 >>= 1 => "
					+ Integer.toBinaryString(i1 >>= 1));
		}
	}
}
