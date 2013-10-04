/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 * 
 */
/*
 * Create and populate a List<Integer>. Create a second List<Integer> of the
 * same size as the first, and use ListIterators to read elements from the first
 * List and insert them into the second in reverse order. (You may want to
 * explore a number of different ways to solve this problem.
 */
public class Exercise12 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(7, 6, 5, 4));

		ListIterator<Integer> it1 = list1.listIterator(4);// list1.size()
		ListIterator<Integer> it2 = list2.listIterator();
		print("list1: " + list1);
		print("list2: " + list2);
		System.out.println();

		while (it2.hasNext()) {
			it2.next();
			it2.set(it1.previous());
		}
		print("list1: " + list1);
		print("list2: " + list2);
	}

}
