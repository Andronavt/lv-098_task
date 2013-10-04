/**
 * 
 */
package interfaces;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 */

abstract class Base1 {
}

class Derived1 extends Base1 {
	void meth() {
		print("Derived1");
	}
}

abstract class Base2 {
	abstract void meth();
}

class Derived2 extends Base2 {
	void meth() {
		print("Derived2");
	}
}

public class Exercise4 {
	public static void test1(Base1 d) {
		((Derived1) d).meth();
	}

	public static void test2(Base2 d) {
		d.meth();
	}

	public static void main(String[] args) {
		Derived1 d1 = new Derived1();
		Exercise4.test1(d1);

		Derived2 d2 = new Derived2();
		Exercise4.test2(d2);
	}
}
/*
 * Create an abstract class with no methods. Derive a class and add a method.
 * Create a static method that takes a reference to the base class, downcasts it
 * to the derived class, and calls the method. In main( ), demonstrate that it
 * works. Now put the abstract declaration for the method in the base class,
 * thus eliminating the need for the downcast.
 */