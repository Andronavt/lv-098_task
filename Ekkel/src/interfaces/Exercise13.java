/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
/*
 * Create an interface, and inherit two new interfaces from that interface.
 * Multiply inherit a third interface from the second two
 */

interface BaseDimond {
	void meth();
}

interface Derivate1 extends BaseDimond {
	void meth1();
}

interface Derivate2 extends BaseDimond {
	void meth2();
}

interface Derivate3 extends Derivate1, Derivate2 {
	void meth3();
}

class ShowDimond implements Derivate3 {
	public void meth() {
	}

	public void meth1() {
	}

	public void meth2() {
	}

	public void meth3() {
	}
}

public class Exercise13 {
	public static void main(String[] args) {
		ShowDimond d = new ShowDimond();
		((Derivate1) d).meth1();
		((Derivate2) d).meth2();
		((BaseDimond) d).meth();
	}

}
