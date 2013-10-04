/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create a class containing a nested class. In main( ), create an instance of
 * the nested class
 */
public class Exercise18 {
	Exercise18() {
		System.out.println("Exercise18()");
	}

	public static class NestedDemo1 {
		NestedDemo1() {
			System.out.println("NestedDemo1()");
		}
	}

	private static class NestedDemo2 {
		NestedDemo2() {
			System.out.println("NestedDemo2()");
		}
	}
	
	public static void main(String[] args) {
		NestedDemo1 en1 = new NestedDemo1();
		NestedDemo2 en2 = new NestedDemo2();
	}
}