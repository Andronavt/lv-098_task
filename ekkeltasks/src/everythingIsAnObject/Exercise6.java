/**
 * 
 */
package everythingIsAnObject;

/**
 * @author Andrew
 * 
 */
public class Exercise6 {

    /**
     * @param s
     * @return
     */
    static int storage(String s) {
	return s.length() * 2;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(Exercise6.storage("hahha"));
    }
}
