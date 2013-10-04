/**
 * 
 */
package innerClasses;


/**
 * @author Andrew
 * 
 */
interface Inner {
    void call();
}

class Test77 {
    private int k;

    private void meth() {
	System.out.println("Method outer");
	System.out.println(k);
    }

    public Inner iner() {
	return new Inner(){
	    public void call() {
	    k = 3;
	    meth();
	    }
	};
    }

}

public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Test77 k = new Test77();
	Inner test = k.iner();
	test.call();
    }

}
