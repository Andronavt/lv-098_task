/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create a class with a non-default constructor (one with arguments) and no
 * default constructor (no "no-arg" constructor). Create a second class that has
 * a method that returns a reference to an object of the first class. Create the
 * object that you return by making an anonymous inner class that inherits from
 * the first class
 */
public class Exercise15 {
	public Base getNewBase(String s) {
		return new Base(s) {
			public void showAnonymous() {
				System.out.println("showAnonymous");
			}
		};
	}

	public static void main(String[] args) {
		Exercise15 ex15 = new Exercise15();
		ex15.getNewBase("OrestO").showS();
	}
}

class Base {
	private String s;

	Base(String s) {
		this.s = s;
	}

	public void showS() {
		System.out.println(s);
	}
}
