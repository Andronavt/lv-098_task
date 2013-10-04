/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	for (int i = 0; i < 1000000; i++)
	    new Finalize();

    }

}

class Finalize {
    protected void finalize() {
	System.out.println("Finalize()!");
    }
}
