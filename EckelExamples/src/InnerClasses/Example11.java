/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
interface Ex11Int {
	void tellme();
}

class Ex11Impl {
	private class Inner implements Ex11Int {
		public void tellme() {
			System.out.println("TELL YOU");
		}

	}
	Ex11Int getValue() {
		return new Inner();
	}
}
public class Example11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex11Impl a = new Ex11Impl();
		a.getValue().tellme();
		//(Inner)a.getValue();
	}
}
