/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise19 {
	public static void main(String[] args) {
		FinalDemov2 fd1 = new FinalDemov2();
		FinalDemov2 fd2 = new FinalDemov2("123");
	}
}

class FinalDemov2 {
	final String str;

	FinalDemov2() {
		// System.out.println(str);
		str = "321";
		System.out.println(str);
	}

	FinalDemov2(String str1) {
		// System.out.println(str);
		str = str1;
		System.out.println(str);
	}
}
/*
 * Create a class with a blank final reference to an object. Perform the
 * initialization of the blank final inside all constructors. Demonstrate the
 * guarantee that the final must be initialized before use, and that it cannot
 * be changed once initialized.
 */
