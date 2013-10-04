/**
 * 
 */
package InnerClasses;

import InnerClasses.Example1.Inner;

/**
 * @author Oleg
 *
 */
public class Example3 {
	private String a;
	Example3() {
		System.out.println("outer");
		a="Initialized string";
	}
	class Inner {
		public Inner() {
			System.out.println("Inner");
		}
		public String toString(){
			return a;
		}

	}
	Inner makeInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		Example3 outer = new Example3();
		Inner inner = outer.makeInner();
		System.out.println(inner);
	}

}
