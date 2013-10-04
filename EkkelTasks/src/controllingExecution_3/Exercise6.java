/**
 * 
 */
package controllingExecution_3;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int begin;
	int end;
	int testval;
	begin =1;
	end=10;
	testval = 5;
	System.out.println(test(begin,end,testval));

    }

    static boolean test(int beginT, int endT, int testvalT) {
	if ((testvalT > beginT) && (testvalT < endT)) {
	    return true;
	} else {
	    return false;
	}
    }
}
