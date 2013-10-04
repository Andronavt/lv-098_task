/**
 * 
 */
package innerClasses;

import iExample.IInnerEx6;

/**
 * @author orecto
 * 
 */
/* Repeat Exercise 7 using an anonymous inner class */
public class Exercise12 {
	public static void main(String[] args) {
		Outer5 o = new Outer5();
		o.showPrivateField();
		o.inner().meth();
		o.showPrivateField();
	}
}

class Outer5 {
	private int privateField = 15;

	private void privateMeth() {
		System.out.println("Outer privateMeth()");
	}

	public IInnerEx6 inner() {
		return new IInnerEx6() {
			private int privateInnerField1 = 15;
			private int privateInnerField2 = 125;

			public String meth() {
				privateField *= 2;
				privateMeth();
				return "OrestO";
			}

			private void showPrivateInnerField2() {
				System.out.println(privateInnerField2);
			}
		};
	}

	public void showPrivateField() {
		System.out.println(privateField);
	}
}