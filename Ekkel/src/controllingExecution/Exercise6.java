/**
 * 
 */
package controllingExecution;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 * 
 */

public class Exercise6 {
	static int test(int testval, int target, int begin, int end) {
		if(testval < begin || testval > end)
			System.out.println("testval is not between begin and end");
		else if(testval >= begin || testval <= end)
			System.out.println("testval is between (and including) begin and end");
		
		if (testval > target)
			return +1;
		else if (testval < target)
			return -1;
		else
			return 0; // Match
	}

	public static void main(String[] args) {
		print(test(10, 5, 5, 10));
		print(test(5, 10, -5, -7));
		print(test(5, 5, 6, 8));
	}
}
/*
 * Modify the two test( ) methods in the previous two programs so that they take
 * two extra arguments, begin and end, and so that testval is tested to see if
 * it is within the range between (and including) begin and end.
 */
