/**
 * 
 */
package innerClasses;

import iExample.IInnerEx6;
import staticPack.InnerEx6;

/**
 * @author orecto
 * 
 */
/*
 * Create an interface with at least one method, in its own package. Create a
 * class in a separate package. Add a protected inner class that implements the
 * interface. In a third package, inherit from your class and, inside a method,
 * return an object of the protected inner class, upcasting to the interface
 * during the return
 */
public class Exercise6 extends InnerEx6 {
	IInnerEx6 getBaseInner() {
		return this.new InnerClass();
	}

	public static void main(String[] args) {
		Exercise6 ex = new Exercise6();
		System.out.println(ex.getBaseInner().meth());
	}
}
