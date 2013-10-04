/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise13 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.meth1();
		b1.meth1("void meth1(String str1)");
		b1.meth1("void meth1(String str1,", " String str2)");
		b1.meth1("void meth1(String str1,", " String str2,", " String str3)");
	}
}

class A1 {
	void meth1() {
		System.out.println("void meth1()");
	}

	void meth1(String str1) {
		System.out.println(str1);
	}

	void meth1(String str1, String str2) {
		System.out.println(str1 + str2);
	}
}

class B1 extends A1 {
	void meth1(String str1, String str2, String str3) {
		System.out.println(str1 + str2 + str3);
	}
}
/*
 * Create a class with a method that is overloaded three times. Inherit a new
 * class, add a new overloading of the method, and show that all four methods
 * are available in the derived class.
 */
