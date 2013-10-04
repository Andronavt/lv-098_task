/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise19 {
	public static void main(String[] args) {
		VarArg va1 = new VarArg("OrestO", "Orest", "orest");
		VarArg va2 = new VarArg(new String("12"), new String("34"));
		String[] strArr = { "qwerty", "123456789", "qazse", "OREST" };
		VarArg va3 = new VarArg(strArr);
	}
}

class VarArg {
	VarArg(String... varArg) {
		for (String str : varArg) {
			System.out.println(str);
		}
		System.out.println();
	}
}
/*
 * Write a method that takes a vararg String array. Verify that you can pass
 * either a comma-separated list of Strings or a String[] into this method
 */
