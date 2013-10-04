/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
class Outer {
	class Inner {
		Inner() {
			System.out.println("Inner constructor");
		}
	}
}
public class Example5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}

}
