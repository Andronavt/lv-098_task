/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise5 {
	public static void main(String[] args) {
		C c = new C("3");
	}
}

class A {
	A(String str) {
		System.out.println("A - constructor " + str);
	}
}

class B {
	B(String str) {
		System.out.println("B - constructor " + str);
	}
}

class C extends A {
	B b;

	C(String str) {
		super("1");
		b = new B("2");
		System.out.println("C - constructor " + str);
	}
}
/*
 * Create two classes, A and B, with default constructors (empty argument lists)
 * that announce themselves. Inherit a new class called C from A, and create a
 * member of class B inside C. Do not create a constructor for C. Create an
 * object of class C and observe the results.
 */