/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */

interface InnerIntEx12 {
	void changedata();
}
public class Example12 {

	private int i = 1;
	public void showData() {
		System.out.println(i);
	}
	public InnerIntEx12 inner() {
		return new InnerIntEx12() {
			public void changedata() {
				i = 10;
			}
		};
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
Example12 ex12= new Example12();
ex12.showData();
ex12.inner().changedata();
ex12.showData();
	}

}
