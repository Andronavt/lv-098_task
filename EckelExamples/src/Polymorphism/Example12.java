/**
 * 
 */
package Polymorphism;

/**
 * @author Oleg
 *
 */
class Rodent1 {
    Rodent1(){
	System.out.println("Rodent constructor");
    }
    void meth1() {
	System.out.println("Rodent meth1");
    }

    void meth2() {
	System.out.println("Rodent meth2");
    }
}

class Mouse1 extends Rodent1 {
    Mouse1(){
	System.out.println("Mouse1 constructor");
    }
    void meth1() {
	System.out.println("Mouse meth1");
    }

    void meth2() {
	System.out.println("Mouse meth2");
    }
}

class Gerbil1 extends Rodent1 {
    Gerbil1(){
	System.out.println("Gerbil1 constructor");
    }
    void meth1() {
	System.out.println("Gerbil meth1");
    }

    void meth2() {
	System.out.println("Gerbil meth2");
    }
}

public class Example12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rodent1[] a = new Rodent1[] { new Gerbil1(), new Mouse1(), new Rodent1() };
	for (Rodent1 b : a) {
	    b.meth1();
	    b.meth2();
	}
    }

}
