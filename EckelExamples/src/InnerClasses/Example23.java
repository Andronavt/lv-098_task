/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
interface U {
	void method1();
	void method2();
	void method3();
}
class A {
	U makeU() {
		return new U() {

			@Override
			public void method1() {
				System.out.println("Meth1");

			}

			@Override
			public void method2() {
				System.out.println("Meth2");
			}

			@Override
			public void method3() {
				System.out.println("Meth3");
			}

		};
	}
}

class B {
	private U[] mas;
	B(int i) {
		mas = new U[i];
	}
	void add(U u, int i) {
		mas[i] = u;
	}
	void delete(int i) {
		mas[i] = null;
	}
	void callmethods() {
		for (U u : mas) {
			u.method1();
			u.method2();
			u.method3();
		}
	}
	void show() {
		for (U u : mas) {
			if (u != null)
				System.out.println(u);
			else System.out.println("null");
		}
	}

}
public class Example23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		B b = new B(3);
		b.add(a1.makeU(), 0);
		b.add(a2.makeU(), 1);
		b.add(a3.makeU(), 2);
		b.callmethods();
		b.show();
		b.delete(1);
		b.show();
	}

}
