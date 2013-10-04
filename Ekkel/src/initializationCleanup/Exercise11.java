/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise11 {
	public static void main(String[] args) {
		FinalizeDemo fd = new FinalizeDemo();
		for (int i = 0; i < 100; i++) {
			new FinalizeDemo();
			System.out.print(i + " ");
			System.gc();
		}
	}
}

class FinalizeDemov2 {
	protected void finalize() {
		System.out.println("protected void finalize()");
	}
}
/*
 * Modify the previous exercise so that your finalize( ) will always be called.
 */