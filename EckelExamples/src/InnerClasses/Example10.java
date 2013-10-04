/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
interface Ex10Int {
	void saySomething();
}
public class Example10 {

	Ex10Int method() {
		if (true) {
			class InnerClass implements Ex10Int {
				public void saySomething() {
					System.out.println("Hello Outer");
				}
			}
			return new InnerClass();
		}
		return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example10 ex10 = new Example10();
		ex10.method().saySomething();
	}

}
