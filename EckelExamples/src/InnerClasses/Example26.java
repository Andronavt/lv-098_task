/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 *
 */
class Outer1{
	public class Inner1{
		Inner1(String i){
			System.out.println("Inner1 "+i);
		}
	}
}

public class Example26 {
	public class Inner2 extends Outer1.Inner1{

		Inner2(Outer1 outer1) {
			outer1.super("asdasd");
			System.out.println("Inner2");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer1 out1= new Outer1();
		Example26 ex26= new Example26();
		Inner2 in2= ex26.new Inner2(out1);
	}

}
