/**
 * 
 */
package controllingExecution;

/**
 * @author Andrew
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void simple() {
	for (int i = 2; i < 500; i++) {
	    int k = i;
	    for (int j = 2; j < k; j++) {
		if (k % j == 0) {
		    k = 0;
		    break;
		}
	    }
	    if (k != 0)
		System.out.println(k);
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise4.simple();
    }

}
