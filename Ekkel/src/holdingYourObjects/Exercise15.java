/**
 * 
 */
package holdingYourObjects;

import java.util.Stack;

/**
 * @author orecto
 * 
 */
/*
 * Stacks are often used to evaluate expressions in programming languages. Using
 * net.mindview.util.Stack, evaluate the following expression, where’+’ means
 * "push the following letter onto the stack," and’-’ means "pop the top of the
 * stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */
public class Exercise15 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		stack.push('U');
		stack.push('n');
		stack.push('c');
		System.out.print(stack.pop());
		stack.push('e');
		stack.push('r');
		stack.push('t');
		System.out.print(stack.pop());
		stack.push('a');
		System.out.print(stack.pop());
		stack.push('i');
		stack.push('n');
		stack.push('t');
		stack.push('y');
		System.out.print(stack.pop());
		stack.push(' ');
		System.out.print(stack.pop());
		stack.push('r');
		stack.push('u');
		System.out.print(stack.pop());
		stack.push('l');
		stack.push('e');
		stack.push('s');
		System.out.print(stack.pop());
	}
}
