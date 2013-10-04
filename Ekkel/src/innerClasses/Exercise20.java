/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create an interface containing a nested class. Implement this interface and
 * create an instance of the nested class
 */
public class Exercise20 {
	public static void main(String[] args) {
		INestedDemo.Nested in = new INestedDemo.Nested();
		in.meth();
	}
}

interface INestedDemo {
	class Nested {
		Nested() {
			System.out.println("Nested()");
		}

		public void meth() {
			System.out.println("OrestO");
		}
	}
}
