/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.LinkedList;

/**
 * @author Andrew
 * 
 */
/*
 * (4) Stacks are often used to evaluate expressions in programming languages.
 * Using net.mindview.util.Stack, evaluate the following expression, where’+’
 * means "push the following letter onto the stack," and’-’ means
 * "pop the top of the stack and print it":
 * "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
	storage.addFirst(v);
    }

    public T peek() {
	return storage.getFirst();
    }

    public T pop() {
	return storage.removeFirst();
    }

    public boolean empty() {
	return storage.isEmpty();
    }

    public String toString() {
	return storage.toString();
    }
}

public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Stack<Character> stack = new Stack<Character>();
	char[] chars = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
	for (int i = 0; i < chars.length; i++) {
	    stack.push(chars[i]);
	}
	while (!stack.empty()) {
	    System.out.println(stack.pop());
	}

    }
}
