/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 *
 */
interface Ex9Int{
	void saySomething();
}
public class Example9 {

	Ex9Int method(){
		class InnerClass implements Ex9Int{
			public void saySomething(){
				System.out.println("Hello Outer");
			}
		}
		return new InnerClass();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example9 ex9= new Example9();
		ex9.method().saySomething();
	}

}
