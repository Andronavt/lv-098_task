/**
 * 
 */
package innerClasses;

/**
 * @author Andrew 
 *         (4) Create an interface U with three methods. Create a class A
 *         with a method that produces a reference to a U by building an
 *         anonymous inner class. Create a second class B that contains an array
 *         of U. B should have one method that accepts and stores a reference to
 *         a U in the array, a second method that sets a reference in the array
 *         (specified by the method argument) to null, and a third method that
 *         moves through the array and calls the methods in U. In main( ),
 *         create a group of A objects and a single B. Fill the B with U
 *         references produced by the A objects. Use the B to call back into all
 *         the A objects. Remove some of the U references from the B.
 */

interface U {
    void method1();

    void method2();

    void method3();
}

class A23 {
    U uMaker() {
	return new U() {

	    @Override
	    public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method3");
	    }

	    @Override
	    public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
	    }

	    @Override
	    public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1");
	    }
	};
    }
}

class B23 {
    U[] u;

    B23(int i) {
	u = new U[i];
    }

    void addU(U us, int i) {
	u[i] = us;
    }
    void deleteU(int i)
    {
	u[i] = null;
    }

    void testUs() {
	for (U us : u) {
	    us.method1();
	    us.method2();
	    us.method3();
	}
    }

    void showUs() {
	for (U us : u) {
	    if (us != null)
		System.out.println(us.toString());
	    else
		System.out.println("I'm null");
	}
    }
}

public class Exercise23 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	A23 a = new A23();
	A23 a1 = new A23();
	B23 b = new B23(2);
	b.addU(a.uMaker(), 0);
	b.addU(a1.uMaker(), 1);
	b.showUs();
	b.testUs();
	b.deleteU(0);
	b.showUs();
    }

}
