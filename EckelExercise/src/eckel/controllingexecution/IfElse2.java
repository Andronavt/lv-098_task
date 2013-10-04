package eckel.controllingexecution;

public class IfElse2 {
    static int test(int testval, int target) {
	if (testval > target)
	    return +1;
	else if (testval < target)
	    return -1;
	else
	    return 0; // Match
    }

    static boolean checkRegion(int testval, int begin, int end) {
	if ((testval >= begin) && (testval <= end)) {
	    return true;
	}
	return false;
    }

    static int myTest(int testval, int target, int begin, int end) {
	if (checkRegion(testval, begin, end))
	    if (testval > target)
		return +1;
	    else if (testval < target)
		return -1;
	return 0;
    }

    public static void main(String[] args) {
	System.out.println(myTest(10, 5, 10, 15));
	System.out.println(myTest(5, 10, 3, 8));
	System.out.println(myTest(5, 5, 3, 8));
    }

}
