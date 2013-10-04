/**
 * 
 */
package innerClasses;

import iExample.IInnerEx6;

/**
 * @author orecto
 * 
 */
/* Repeat Exercise 9 using an anonymous inner class */
public class Exercise13 {
	public static void main(String[] args) {
		Outer6 o = new Outer6();
		System.out.println(o.methOuter().meth());
	}
}

class Outer6 {
	IInnerEx6 methOuter() {
		return new IInnerEx6() {
			public String meth() {
				return "OrestO";
			}
		};
	}
}