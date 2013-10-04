/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 * 
 */
class MyClass1 implements debug.MyInterface {

	@Override
	public void method1() {
		System.out.println("1");
	}

	@Override
	public void method2() {
		System.out.println("2");
	}

	@Override
	public void method3() {
		System.out.println("3");
	}

}
public class Example5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyClass1 a = new MyClass1();
		a.method1();
		a.method2();
		a.method3();
	}

}
