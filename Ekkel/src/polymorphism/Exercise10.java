/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise10 {
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.meth1(derived);
	}

}

class Base {
	void meth1(Base b) {
		System.out.println(b.meth2());
	}

	String meth2() {
		return "Base -> void meth2()";
	}
}

class Derived extends Base {
	@Override
	String meth2() {
		return "Derived -> void meth2()";
	}
}
/*
 * Create a base class with two methods. In the first method, call the second
 * method. Inherit a class and override the second method. Create an object of
 * the derived class, upcast it to the base type, and call the first method.
 * Explain what happens
 */