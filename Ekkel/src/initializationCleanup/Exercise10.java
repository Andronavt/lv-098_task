/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise10 {
	public static void main(String[] args) {
		FinalizeDemo fd = new FinalizeDemo();
	}
}

class FinalizeDemo{
	protected void finalize(){
		System.out.println("protected void finalize()");
	}
}
/*
 * Create a class with a finalize( ) method that prints a message. In main( ),
 * create an object of your class. Explain the behavior of your program
 */
