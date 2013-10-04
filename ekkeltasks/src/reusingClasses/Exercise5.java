/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class A {
    A() {
	System.out.println("Class A");
    }
}

class B {
    B() {
	System.out.println("Class B");
    }
}

class C extends A {
    B b = new B();

}

public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	new C();
    }

}
