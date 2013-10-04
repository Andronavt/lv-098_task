/**
 * 
 */
package holdingYourObjects_10;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Богдан
 * 
 */
public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String s = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-";
	char[] array = s.toCharArray();
	Stack stack = new Stack();
	System.out.print("Pop from Stack: ");
	for (int i = 0; i < array.length; i++) {
	    if (array[i] == '+') {
		stack.push(array[i + 1]);
	    }
	    if (array[i] == '-') {
		System.out.print(stack.pop());

	    }
	}
	System.out.println();
	System.out.println("Stay in Stack: " + Arrays.toString(stack.toArray()));
    }

}
