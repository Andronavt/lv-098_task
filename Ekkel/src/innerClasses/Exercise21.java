/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create an interface that contains a nested class that has a static method
 * that calls the methods of your interface and displays the results. Implement
 * your interface and pass an instance of your implementation to the method
 */
public class Exercise21 implements INestedDemo2 {
	public String meth1() {
		return "OrestO ";
	}

	public String meth2() {
		return "Tierd";
	}

	public static void main(String[] args) {
		Exercise21 x = new Exercise21();
		INestedDemo2.Nested.testINestedDemo2(x);
	}
}

interface INestedDemo2 {
	String meth1();

	String meth2();

	class Nested {
		static void testINestedDemo2(INestedDemo2 i) {
			System.out.println(i.meth1() + i.meth2());
		}
	}
}
