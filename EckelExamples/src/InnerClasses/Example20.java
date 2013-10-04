/**
 * 
 */
package InnerClasses;

import InnerClasses.Int.Nested;

/**
 * @author Oleg
 *
 */
interface Int{
	class Nested{
		Nested(){
			System.out.println("NEsted in interface");
		}
	}
}
public class Example20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Nested a= new Nested();
	}

}
