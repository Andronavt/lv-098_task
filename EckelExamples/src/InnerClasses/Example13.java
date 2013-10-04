/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
interface Ex13Int {
	void saySmth();
}
public class Example13 {

	Ex13Int method() {
		return new Ex13Int() {

			public void saySmth() {
				System.out.println("Saying");
			}
		};
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
Example13 ex13= new Example13();
ex13.method().saySmth();
	}

}
