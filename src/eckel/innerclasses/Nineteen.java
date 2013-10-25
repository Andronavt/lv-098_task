package eckel.innerclasses;

/*
 * ex 19
 */
public class Nineteen {
    public Nineteen() {
	System.out.println("Nineteen()");
    }

    private class Inner1 {
	public Inner1() {
	    System.out.println("Inner1()");
	}

	private class Inner2 {
	    public Inner2() {
		System.out.println("Inner2()");
	    }
	}
    }

    private static class Nested1 {
	public Nested1() {
	    System.out.println("Nested1()");
	}

	private static class Nested2 {
	    public Nested2() {
		System.out.println("Nested2()");
	    }
	}
    }

    public static void main(String[] args) {
	Nested1 n1 = new Nested1();
	Nested1.Nested2 n2 = new Nested1.Nested2();
	Nineteen n = new Nineteen();
	Inner1 i1 = n.new Inner1();
	Inner1.Inner2 i2 = i1.new Inner2();
    }

}
