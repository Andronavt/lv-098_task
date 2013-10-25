package eckel.util;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    private String plus = "+";
    private String min = "-";

    public void push(T v) {
	storage.addFirst(v);
	System.out.print(plus + v);
    }

    public T peek() {
	return storage.getFirst();
    }

    public T pop() {
	System.out.print(min);
	return storage.removeFirst();
    }

    public boolean empty() {
	return storage.isEmpty();
    }

    public String toString() {
	return storage.toString();
    }
} // /:~

