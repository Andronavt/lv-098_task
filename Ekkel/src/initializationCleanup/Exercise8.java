/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise8 {
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.method1();
	}
}

class ThisDemo {
	public void method1() {
		method2();
		this.method2();
	}

	public void method2() {
		System.out.println("method2");
	}
}
/*
 * Create a class with two methods. Within the first method, call the second
 * method twice: the first time without using this, and the second time using
 * this—just to see it working; you should not use this form in practice.
 */
