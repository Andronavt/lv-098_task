/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */

public class Example8 {

	class Inner {
		private int i = 10;
		private void say() {
			System.out.println("Hello Outer");
		}
	}
	public void getInnerValue() {
		System.out.println(new Inner().i);
	}

	public void getInnerMethod() {
		new Inner().say();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example8 ex8 = new Example8();
		ex8.getInnerMethod();
		ex8.getInnerValue();
	}

}
