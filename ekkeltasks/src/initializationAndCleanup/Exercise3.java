/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Ex ex = new Ex();

    }

}

class Ex {
    Ex() {
	System.out.println("Constructor");
    }

    Ex(String k) {
	System.out.println(k);
    }
}
