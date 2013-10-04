/**
 * 
 */
package innerClasses;

import iExample.IInnerEx6;

/**
 * @author orecto
 * 
 */
/*
 * Create an interface with at least one method, and implement that interface by
 * defining an inner class within a method, which returns a reference to your
 * interface
 */
public class Exercise9 {
	public static void main(String[] args) {
		Outer3 temp = new Outer3();
		System.out.println(temp.methOuter().meth());
	}
}

class Outer3 {
	IInnerEx6 methOuter() {
		class Inner implements IInnerEx6 {
			public String meth() {
				return "OrestO";
			}
		}
		return new Inner();
	}

	IInnerEx6 methOuter(int i) {
		if (i % 2 == 0) {
			class Inner implements IInnerEx6 {
				public String meth() {
					return "OrestO";
				}
			}
			return new Inner();
		}
		return null;
	}
}