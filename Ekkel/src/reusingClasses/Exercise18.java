/**
 * 
 */
package reusingClasses;

/**
 * @author orecto
 * 
 */
public class Exercise18 {
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		// fd.min++;
		// fd.MAX++;

		System.out.println(fd.max.i++);
		System.out.println(fd.max.i++);

		System.out.println(fd.MIN.i++);
		System.out.println(fd.MIN.i++);

		// fd.max = new FinalDemo();
		// fd.MIN = new FinalDemo();

	}
}

class Value {
	int i = 10;

	Value() {
	}

	Value(int i) {
		this.i = i;
	}
}

class FinalDemo {
	static final int MAX = 10;
	final int min = 1;

	static final Value MIN = new Value(5);
	final Value max = new Value(15);

}
/*
 * Create a class with a static final field and a final field and demonstrate
 * the difference between the two
 */