/**
 * 
 */
package InnerClasses;

import debug.InnerInterface;

/**
 * @author Oleg
 * 
 */
class OuterExample6 {
	protected class InnerClass implements InnerInterface {

		InnerClass() {
			System.out.println("InnerClass");
		}
		public String tell() {
			return "Tell you";
		}

	}
}
public class Example6 extends OuterExample6 {

	InnerInterface getInner() {
		return this.new InnerClass();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example6 ex6 = new Example6();
		System.out.println(ex6.getInner().tell());
	}

}
