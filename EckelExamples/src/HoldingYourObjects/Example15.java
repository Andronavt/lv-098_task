/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Oleg Exercise 15: (4) Stacks are often used to evaluate expressions
 *         in programming languages. Using net.mindview.util.Stack, evaluate the
 *         following expression, where’+’ means "push the following letter onto
 *         the stack," and’-’ means "pop the top of the stack and print it":
 *         "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */

class Stack {
	private ArrayList<Character> stack = new ArrayList<Character>();
	public void push(Character c) {
		System.out.println("Push " + c);
		stack.add(c);
	}
	public void pop() {
		if (!stack.isEmpty()) {
			System.out.println(stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		}
	}
}
public class Example15 {

	public static void myFunc(String s) {
		Stack stack = new Stack();
		ArrayList<Character> aC = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			aC.add(s.charAt(i));
		}
		Iterator<Character> it = aC.iterator();
		while (it.hasNext()) {

			switch (it.next()) {
				default :
				case '+' :
					stack.push(it.next());
					break;
				case '-' :
					stack.pop();
					break;
			}
		}

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-";
		myFunc(input);

	}

}
