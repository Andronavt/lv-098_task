package eckel.innerclasses;

/*
 * ex 23
 */

interface U {
    void uA();

    void uB();

    void uC();
}

class A {
    U createU() {
	return new U() {

	    @Override
	    public void uC() {
		System.out.println("uC()");
	    }

	    @Override
	    public void uB() {
		System.out.println("uB()");
	    }

	    @Override
	    public void uA() {
		System.out.println("uC()");
	    }
	};
    }
}

class B {
    private U[] arru;

    public B(int size) {
	arru = new U[size];
    }

    public void addElement(int index, U u) {
	arru[index] = u;
    }

    public void setNull(int index) {
	arru[index] = null;
    }

    public void callsMethods() {
	for (U u : arru) {
	    u.uA();
	    u.uB();
	    u.uC();
	}
    }

    public void showArr() {
	for (U u : arru) {
	    if (u != null)
		System.out.println(u.toString());
	    else
		System.out.println("NuLl");
	}
    }
}

public class TwentyThree {

    public static void main(String[] args) {
	A a1 = new A();
	A a2 = new A();
	A a3 = new A();
	B b = new B(3);
	b.addElement(0, a1.createU());
	b.addElement(1, a2.createU());
	b.addElement(2, a3.createU());
	b.showArr();
	b.callsMethods();
	b.setNull(2);
	b.showArr();
    }

}
