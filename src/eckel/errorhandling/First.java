package eckel.errorhandling;

/*
 * ex 1
 */

class Ex extends Exception {
    Ex(String s) {
	super(s);
	System.out.println(s);
	// System.out.println();
    }
}

public class First {
    static void foo() throws Ex {
	throw new Ex("Foo");
    }

    public static void main(String[] args) {
	try {
	    foo();
	} catch (Exception e) {
	    e.printStackTrace();
	    e.getMessage();
	} finally {
	    System.out.println("finally");
	}
    }

}
