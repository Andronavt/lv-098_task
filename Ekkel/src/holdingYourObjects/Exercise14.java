/**
 * 
 */
package holdingYourObjects;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author orecto
 * 
 */
/*
 * Create an empty LinkedList<Integer>. Using a Listlterator, add Integers to
 * the List by always inserting them in the middle of the List.
 */
public class Exercise14 {
	static void addMiddle(LinkedList<Integer> list, ListIterator<Integer> it) {
		for (int i = 0; i < 10; i++) {
			it.add(i);
			System.out.println(list);
			if (i % 2 == 0)
				it.previous();
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> it = list.listIterator();

		Exercise14.addMiddle(list, it);
	}
}
