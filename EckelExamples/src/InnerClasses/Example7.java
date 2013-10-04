/**
 * 
 */
package InnerClasses;

import javax.print.attribute.standard.OutputDeviceAssigned;

/**
 * @author Oleg
 * 
 */
class Outer7 {
	private int i;
	private void meth1() {
		System.out.println("Method1");
	}
	public void showChanges() {
		System.out.println(i);
	}
	class Inner7 {
		void makeChanges() {
			i = 10;
			meth1();
		}

	}
	public void perform() {
		Inner7 a = new Inner7();
		a.makeChanges();
	}
}

public class Example7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer7 out = new Outer7();
		out.showChanges();
		out.perform();
		out.showChanges();
	}

}
