/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 * 
 */

abstract class Test4 {
    abstract void method();

}

class Test44 extends Test4 {
    void method() {
	System.out.println("Method from Test42");
    }
}

public class Exercise4 {

    static void method2(Test4 k) {
	Test44 kk = (Test44) k;
	k.method();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	// method2(new Test4());  - now working
	
    }

}
