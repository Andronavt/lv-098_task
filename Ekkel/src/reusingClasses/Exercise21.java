/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise21 extends FinalMeth {
	// void meth(){
	// System.out.println("final void meth()");
	// }
	public static void main(String[] args) {

	}
}

class FinalMeth {
	final void meth() {
		System.out.println("final void meth()");
	}
}
/*
 * Create a class with a final method. Inherit from that class and attempt to
 * overwrite that method
 */