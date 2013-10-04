/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */

class MyFloat {
    float a=10.1f;
}

public class Example3 {

    static void f(MyFloat a)
    {
	a.a=100.1f;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
	MyFloat el1 = new MyFloat();
	System.out.println(el1.a);
	f(el1);
	System.out.println(el1.a);

    }

}
