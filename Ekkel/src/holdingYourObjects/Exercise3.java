/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;

/**
 * @author orecto
 * 
 */
/*
 * Modify innerclasses/Sequence.java so that you can add any number of elements
 * to it
 */

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Exercise3 {
	private ArrayList<Object> items = new ArrayList<Object>();

	public void add(Object x) {
		items.add(x);
	}

	private class Sequence3Selector implements Selector {
		private int curr = 0;

		public boolean end() {
			return curr == items.size();
		}

		public Object current() {
			return items.get(curr);
		}

		public void next() {
			curr++;
		}
	}

	public Selector selector() {
		return new Sequence3Selector();
	}

	public static void main(String[] args) {
		Exercise3 s3 = new Exercise3();
		for (int i = 0; i < 15; i++)
			s3.add(i);
		Selector selector = s3.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		s3.add(10);
		s3.add(11);
		s3.add(13);
		s3.add(13);
		s3.add("OrestO");
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
