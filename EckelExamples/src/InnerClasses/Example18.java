/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 *
 */
public class Example18 {

	public Example18() {
	System.out.println("Example18 constructor");
	}
	public static class Nested1{
		Nested1(){
			System.out.println("Nested1");
		}
	}
	private static class Nested2{
		Nested2(){
			System.out.println("Nested2");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Nested1 n1= new Nested1();
	Nested2 n2 = new Nested2();
	}

}
