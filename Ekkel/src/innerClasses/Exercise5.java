/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create a class with an inner class. In a separate class, make an instance of
 * the inner class
 */
public class Exercise5 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner oi1 = o.new Inner();

		Outer1.Inner oi2 = new Outer1().new Inner();
	}
}

class Outer1 {
	class Inner {
		Inner() {
			System.out.println("Outer1.Inner()");
		}
	}
}
