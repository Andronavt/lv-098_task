/**
 * 
 */
package interfaces;

import iExample.IExemple;

/**
 * @author orecto
 * 
 */
public class Exercise5 implements IExemple {
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
		Exercise5 exercise5 = new Exercise5();
		exercise5.meth1();
		exercise5.meth2();
		exercise5.meth3();
	}
}
/*
 * Create an interface containing three methods, in its own package. Implement
 * the interface in a different package
 */