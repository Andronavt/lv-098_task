/**
 * 
 */
package innerClasses;

import iExample.IExemple;

/**
 * @author orecto
 * 
 */
/*
 * Create an interface U with three methods. Create a class A with a method that
 * produces a reference to a U by building an anonymous inner class. Create a
 * second class B that contains an array of U. B should have one method that
 * accepts and stores a reference to a U in the array, a second method that sets
 * a reference in the array (specified by the method argument) to null, and a
 * third method that moves through the array and calls the methods in U. In
 * main( ), create a group of A objects and a single B. Fill the B with U
 * references produced by the A objects. Use the B to call back into all the A
 * objects. Remove some of the U references from the B
 */
public class Exercise23 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();

		B b1 = new B();

		b1.storeArr(a1.interRef());
		b1.storeArr(a2.interRef());
		b1.storeArr(a3.interRef());
		b1.storeArr(a4.interRef());
		b1.storeArr(a5.interRef());

		b1.callMeth();
		b1.showMeth();

		b1.setValToArr(1);
		b1.setValToArr(3);

		// b1.callMeth();
		b1.showMeth();
	}

}

interface U extends IExemple {

}

class A {
	U interRef() {
		return new U() {
			public void meth1() {
				System.out.println("void meth1()");
			}

			public void meth2() {
				System.out.println("void meth2()");
			}

			public void meth3() {
				System.out.println("void meth3()");
			}
		};
	}
}

class B {
	private int size = 4;
	private int currPos = 0;
	private U[] uArr = new U[size];

	void storeArr(U obj) {
		if (currPos == size) {
			size += 10;
			U[] temp = new U[size];
			for (int i = 0; i < size - 10; i++) {
				temp[i] = uArr[i];
			}
			uArr = temp;
		}
		uArr[currPos++] = obj;
	}

	void setValToArr(int index) {
		if (index >= size || index < 0)
			return;
		uArr[index] = null;
	}

	void callMeth() {
		for (int i = 0; i < currPos; i++) {
			System.out.println("i -> " + i);
			uArr[i].meth1();
			uArr[i].meth2();
			uArr[i].meth3();
			System.out.println();
		}
	}

	void showMeth() {
		for (int i = 0; i < currPos; i++) {
			if (uArr[i] != null)
				System.out.println(i + uArr[i].getClass().getSimpleName()
						+ " -> exists");
			else
				System.out.println(i + " null");
		}
		System.out.println();
	}
}