/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Write a class named Outer that contains an inner class named Inner. Add a
 * method to Outer that returns an object of type Inner. In main( ), create and
 * initialize a reference to an Inner
 */
public class Exercise1 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.makeInner();
	}

}

class Outer {
	private String str;

	class Inner {
		Inner() {
			System.out.println("Inner()");
		}

		public String toString() {
			return str;
		}
	}

	Outer() {
		System.out.println("Outer()");
		str = "";
	}

	Outer(String str) {
		System.out.println("Outer()");
		this.str = str;
	}

	Inner makeInner() {
		return new Inner();
	}
}