/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Determine whether an outer class has access to the private elements of its
 * inner class
 */
public class Exercise8 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.showOuterI();
		out.showPrivateInnerField2();
		out.testInner();
		out.showOuterI();
		out.showPrivateInnerField2();

	}
}
