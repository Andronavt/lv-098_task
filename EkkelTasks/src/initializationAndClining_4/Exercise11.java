/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 *
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test11();
	System.gc();

    }

}
class Test11 {

    protected void finalize() {
	System.out.println("Method finalize()");
    }
}