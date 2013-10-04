/**
 * 
 */
package interfaces;

import iExample.IExemple;

/**
 * @author orecto
 * 
 */
public class Exercise6 implements IExemple {

	// void meth1() {
	// System.out.println("void meth1()");
	// }
	//
	// protected void meth1() {
	// System.out.println("void meth1()");
	// }
	//
	// private void meth1() {
	// System.out.println("void meth1()");
	// }

	public void meth1() {
		System.out.println("void meth1()");
	}

	public void meth2() {
		System.out.println("void meth2()");
	}

	public void meth3() {
		System.out.println("void meth3()");
	}

	public static void main(String[] args) {
		Exercise6 exercise6 = new Exercise6();
		exercise6.meth1();
		exercise6.meth2();
		exercise6.meth3();
	}
}
/* Prove that all the methods in an interface are automatically public */