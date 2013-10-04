/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise3 {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		float f1 = 12f;
		float f2 = 18f;

		System.out.println("f1 => " + f1);
		System.out.println("f2 => " + f2 + '\n');

		f1 = f2;

		System.out.println("f1 => " + f1);
		System.out.println("f2 => " + f2);
	}
}
