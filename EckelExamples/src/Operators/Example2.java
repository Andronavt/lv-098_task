/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */
class FloatClass {
    float a;
}

public class Example2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	FloatClass el1 = new FloatClass();
	FloatClass el2 = new FloatClass();
	el1.a = 1.1f;
	el2.a = 1.2f;
	System.out.println("Before aliasing el1.a= " + el1.a + " ,el2.a = "
		+ el2.a);
	el1 = el2;
	System.out.println("el1=el2 was done");
	System.out.println("After aliasing el1.a= " + el1.a + " ,el2.a = "
		+ el2.a);

    }

}
