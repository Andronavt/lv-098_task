/**
 * 
 */
package initializationAndClining_4;

/**
 * @author ������
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test10();
	

    }

}

class Test10 {

    protected void finalize() {
	System.out.println("Method finalize()");
    }
}