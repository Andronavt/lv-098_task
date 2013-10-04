/**
 * 
 */
package Polymorphism;

/**
 * @author Oleg
 * 
 */
class Rodent {
    void meth1() {
	System.out.println("Rodent meth1");
    }

    void meth2() {
	System.out.println("Rodent meth2");
    }
}

class Mouse extends Rodent {
    void meth1() {
	System.out.println("Mouse meth1");
    }

    void meth2() {
	System.out.println("Mouse meth2");
    }
}

class Gerbil extends Rodent {
    void meth1() {
	System.out.println("Gerbil meth1");
    }

    void meth2() {
	System.out.println("Gerbil meth2");
    }
}

public class Example9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rodent[] a = new Rodent[] { new Gerbil(), new Mouse(), new Rodent() };
	for (Rodent b : a) {
	    b.meth1();
	    b.meth2();
	}
    }

}
