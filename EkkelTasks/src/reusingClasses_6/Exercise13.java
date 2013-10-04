/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test132 obj = new Test132();
	obj.method();
	obj.method(0);
	obj.method(null);
	obj.method(0, null);
    }

}

class Test13 {
    void method() {
	System.out.println("method()");
    }

    void method(int i) {
	System.out.println("method(int i)");
    }

    void method(String s) {
	System.out.println("method(String s)");
    }
}

class Test132 extends Test13 {
    void method(int i, String s) {
	System.out.println("void method(int i, String s)");
    }
}
