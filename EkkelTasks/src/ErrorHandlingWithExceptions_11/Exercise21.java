/**
 * Exercise 21:   (2) Demonstrate that a derived-class constructor cannot catch exceptions 
 * thrown by its base-class constructor.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    new Test21_2(1);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}

class Test21_1 {
    public Test21_1(int i) throws Exception {
	throw new Exception(">>Exception<<");
    }
}

class Test21_2 extends Test21_1 {
    public Test21_2(int i) throws Exception {
	// try {
	super(i);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
    }
}