/**
 * 
 */
package reusingClasses;

import static staticPack.StaticPrint.print;

class WithFinals {
	private final void f() {
		print("WithFinals.f()");
	}

	private void g() {
		print("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	// @Override
	private final void f() {
		print("OverridingPrivate.f()");
	}

	// @Override
	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	// @Override
	public final void f() {
		print("OverridingPrivate2.f()");
	}

	// @Override
	public void g() {
		print("OverridingPrivate2.g()");
	}
}

public class Exercise20 {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
		WithFinals wf = op2;
	}
}

/* Show that @Override annotation solves the problem in this section */