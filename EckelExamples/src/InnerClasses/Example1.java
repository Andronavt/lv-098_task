/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
public class Example1 {
	Example1() {
		System.out.println("outer");
	}
	class Inner {
		public Inner() {
			System.out.println("Inner");
		}

	}
	Inner makeInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		Example1 outer = new Example1();
		Inner inner = outer.makeInner();
	}
}
