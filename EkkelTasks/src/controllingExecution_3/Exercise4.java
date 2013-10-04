/**
 * 
 */
package controllingExecution_3;

/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

	for (int i = 1; i < 100; i++) {
	    int t = i;
	    for (int j = 2; j < t; j++) {
		if (t % j == 0) {
		    t = 0;
		    break;
		}
	    }
	    if (t != 0)
		System.out.println(t);
	}
    }

}
