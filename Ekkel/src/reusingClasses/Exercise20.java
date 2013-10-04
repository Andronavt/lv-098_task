/**
 * 
 */
package reusingClasses;

import static staticPack.StaticPrint.print;

class WithFinals {
	// To ��, ��� � ������ private:
	private final void f() {
		print("WithFinals.f()");
	}

	// ����� ������������� �������� final:
	private void g() {
		print("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}

	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}

	public void g() {
		print("OverridingPrivate2.g()");
	}
}
asdfgh
public class Exercise20 {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// ����� �������� ���������� ��������������:
		OverridingPrivate op = op2;
		// �� ������ ��� ���� ������� ����������:
		// ! op.f();
		// ! op.g();
		// � �� �� ����� �����:
		WithFinals wf = op2;
		// ! wf.f();
		// ! wf.g();
	}
}

/* Show that @Override annotation solves the problem in this section */