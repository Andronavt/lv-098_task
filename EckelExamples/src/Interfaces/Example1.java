/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 * 
 */
abstract class Rodent {
	abstract void meth1();

	abstract void meth2();
}

class Mouse extends Rodent {
	void meth1() {
		System.out.println("Mouse meth1");
	}

	void meth2() {
		System.out.println("Mouse meth2");
	}
}

class Gerbil extends Rodent {
	void meth1() {
		System.out.println("Gerbil meth1");
	}

	void meth2() {
		System.out.println("Gerbil meth2");
	}
}
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rodent[] a = new Rodent[]{new Gerbil(), new Mouse()};
		for (Rodent b : a) {
			b.meth1();
			b.meth2();
		}
	}

}
