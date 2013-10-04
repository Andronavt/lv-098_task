/**
 * 
 */
package controllingExecution;

/**
 * @author Andrew
 * 
 */
class IfElse2 {
    public static int test(int testval, int begin, int end) {
	if (testval >= begin) {
	    if (testval <= end)
		return 1;
	}
	return -1; // Match
    }
}

public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(IfElse2.test(10, 5, 15));
    }

}
