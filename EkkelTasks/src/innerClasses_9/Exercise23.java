/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise23 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	A objA1 = new A();
	A objA2 = new A();
	A objA3 = new A();
	A objA4 = new A();
	B objB = new B(4);
	objB.insert(objA1.refU(), 0);
	objB.insert(objA2.refU(), 1);
	objB.insert(objA3.refU(), 2);
	objB.insert(objA4.refU(), 3);
	objB.call(objB.array);
	System.out.println("Delete some U's");
	objB.delete(2);
	objB.delete(3);
	objB.call(objB.array);

    }
}

interface U {
    void a();

    void b();

    void c();
}

class A {
    U refU() {
	return new U() {
	    @Override
	    public void a() {
		System.out.println("A.U.a()");
	    }

	    @Override
	    public void b() {
		System.out.println("A.U.b()");
	    }

	    @Override
	    public void c() {
		System.out.println("A.U.c()");
	    }
	};
    }
}

class B {
    U[] array;

    B(int i) {
	array = new U[i];
    }

    void insert(U u, int i) {
	array[i] = u;
    }

    void delete(int i) {
	array[i] = null;
    }

    void call(U[] array) {
	for (U u : array) {
	    if (u != null) {
		u.a();
		u.b();
		u.c();
	    }
	}
    }

}
