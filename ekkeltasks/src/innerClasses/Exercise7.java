/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * 
 */

class Test7 {
    private int k;

    private void meth() {
	System.out.println("Method outer");
	System.out.println(k);
    }

    class Iner {
	void call() {
	    
	    k = 3;
	    meth();
	}
    }

    void method() {
	Iner inner = new Iner();
	inner.call();

    }
}

public class Exercise7 {

    /**
     * @param args
     */

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Test7 k = new Test7();
	k.method();
    }

}
