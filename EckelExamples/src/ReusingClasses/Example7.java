/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 *
 */
class My2A {
    My2A(String s) {
	System.out.println(s);
    }
}

class My2B {
    My2B(String s) {
	System.out.println(s);
    }
}

class My2C extends My2A {
    My2C(String s) {
	super(s);
	System.out.println(s);
    }

    My2B b = new My2B("aaa");
}

public class Example7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	My2C c= new My2C("bbb");
    }

}
