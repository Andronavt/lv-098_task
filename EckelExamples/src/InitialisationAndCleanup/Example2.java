/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 * 
 */
class A {
    String s = "aaa";
}

class B {
    String s;

    B() {

    }

    B(String s) {
	this.s = s;
    }
}

public class Example2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	A a = new A();
	B b = new B();
	System.out.println(a.s);
	System.out.println(b.s);
	b = new B("Sdsd");
	System.out.println(b.s);
    }

}
