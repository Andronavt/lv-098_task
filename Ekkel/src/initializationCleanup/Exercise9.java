/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise9 {
	public static void main(String[] args) {
		ConstrDemov3 cd = new ConstrDemov3("OrestO");
	}
}

class ConstrDemov3 {
	public ConstrDemov3(String str) {
		this();
		System.out.println(str);
	}

	public ConstrDemov3() {
		System.out.println("public ThisDemo()");
	}
}
/*
 * Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one
 */