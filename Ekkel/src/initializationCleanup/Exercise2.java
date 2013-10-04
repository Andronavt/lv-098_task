/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise2 {
	public static void main(String[] args) {
		String1 s1 = new String1();
		String2 s2 = new String2("OrestO");

		System.out.println(s1.str);
		System.out.println(s2.str);
	}
}

class String1 {
	String str = "OrestO";
}

class String2 {
	String str;

	String2(String str) {
		this.str = str;
	}
}
