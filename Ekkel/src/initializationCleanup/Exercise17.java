/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise17 {
	public static void main(String[] args) {
		StrArg[] sa = new StrArg[5];
	}
}

class StrArg {

	public StrArg(String str) {
		System.out.println(str);
	}
}
/*
 * Create a class with a constructor that takes a String argument. During
 * construction, print the argument. Create an array of object references to
 * this class, but don’t actually create objects to assign into the array. When
 * you run the program, notice whether the initialization messages from the
 * constructor calls are printed.
 */