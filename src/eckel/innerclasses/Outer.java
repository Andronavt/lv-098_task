package eckel.innerclasses;

/*
 * ex 1 and ex 3
 */

public class Outer {
    private String line;

    Outer(String line) {
	this.line = line;
    }

    class Inner {
	public Inner() {
	    System.out.println("Inner");
	}

	public String toString() {
	    return line;
	}
    }

    Inner createInner() {
	return new Inner();
    }

    public static void main(String[] args) {
	Outer o = new Outer("This is SPARTA");
	Inner i = o.createInner();
	System.out.println(i.toString());
    }
}
