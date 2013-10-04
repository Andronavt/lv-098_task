/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise15 {
	public static void main(String[] args) {
		new StrInstInit("OrestO");
	}
}

class StrInstInit {
	String str;

	StrInstInit(String str) {
		this.str = str;
	}
}
/*
 * Create a class with a String that is initialized using instance
 * initialization
 */