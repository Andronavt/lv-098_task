/**
 * 
 */
package innerClasses;


/**
 * @author orecto
 * 
 */
/*
 * Create a class with a private field and a private method. Create an inner
 * class with a method that modifies the outer-class field and calls the
 * outer-class method. In a second outer-class method, create an object of the
 * inner class and call its method, then show the effect on the outer-class
 * object
 */
public class Exercise7 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.showPrivateField();
		out.testInner();
		out.showPrivateField();
	}
}

class Outer2 {
	private int privateField = 15;
	private void privateMeth() {
		System.out.println("Outer privateMeth()");
	}
	
	class Inner {
		void meth() {
			privateField *= 2;
			privateMeth();
		}
		private int privateInnerField1 = 15;
		private int privateInnerField2 = 125;
		private void showPrivateInnerField2() { System.out.println(privateInnerField2); }
	}

	int outerI = new Inner().privateInnerField1;
	public void showPrivateField() {
		System.out.println(privateField);
	}

	void showOuterI() { System.out.println(outerI); }
	void showPrivateInnerField2() { new Inner().showPrivateInnerField2(); } 
	void testInner() {
		Inner in = new Inner();
		in.meth();
	}
}