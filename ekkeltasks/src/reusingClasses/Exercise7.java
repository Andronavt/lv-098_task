/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class A1 {
    A1(int k) {
	System.out.println(k);
    }
}

class B1 {
    B1(int b) {

	System.out.println(b);
    }
}

class C1 extends A1 {
    C1(int a) {
	super(a);
	B1 b = new B1(a);
    }

}

public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	new C1(15);

    }

}
