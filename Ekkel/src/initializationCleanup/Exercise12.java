/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise12 {
	public static void main(String[] args) {
		new Tank().dropObj();
		System.gc();
		new Tank().dropObj();
		System.gc();
		new Tank();
		System.gc();
		new Tank().dropObj();
		System.gc();
		new Tank().dropObj();
		System.gc();
		new Tank();
		System.gc();
		new Tank().dropObj();
		System.gc();
	}
}

class Tank {
	String state;

	Tank() {
		state = "filled";
	}

	public void dropObj() {
		state = "empty";
	}

	protected void finalize() {
		if (state.equals("empty"))
			System.out.println("protected void finalize()");
	}
}
/*
 * Create a class called Tank that can be filled and emptied, and has a
 * termination condition that it must be empty when the object is cleaned up.
 * Write a finalize( ) that verifies this termination condition. In main( ),
 * test the possible scenarios that can occur when your Tank is used
 */
