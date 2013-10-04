/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 * 
 */
abstract class Myclass {

}
class RealiseMy extends Myclass {
	protected void say() {
		System.out.println("say");
	}
}

public class Example4 {

	public static void method(Myclass dadval) {
		((RealiseMy)dadval).say();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Example4.method(new RealiseMy());
	}

}
