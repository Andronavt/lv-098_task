/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 *
 */
interface Int21{
	void meth1();
	void meth2();
	class Nested{
		public static void check(Int21 value){
		value.meth1();
		value.meth2();
		}
	}
}
public class Example21 implements Int21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example21 ex21 = new Example21();
		Int21.Nested.check(ex21);

	}

	
	public void meth1() {
		System.out.println("Method 1");
		
	}


	public void meth2() {
		System.out.println("Method 2");
		
	}

}
