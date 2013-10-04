/**
 * 
 */
package holdingYourObjects;

import java.util.*;

/**
 * @author orecto
 * 
 */
/*
 * Write a method that uses an Iterator to step through a Collection and print
 * the toString( ) of each object in the container. Fill all the different types
 * of Collections with objects and apply your method to each container
 */
public class Exercise11 {
	public static void printCollection(Collection<?> c) {
		Iterator<?> it = c.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().toString() + '\t');
		}
		System.out.println();
	}

	public static void main(String[] args) {
		HashSet<Float> hs = new HashSet<Float>(Arrays.asList(36.6f, 25.5f));
		LinkedList<Character> ll = new LinkedList<Character>(Arrays.asList('O',
				'r', 'e', 'c', 't', 'O'));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(
				159, 753, 258, 456));
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 5, 9,
				15, 157));
		TreeSet<Double> ts = new TreeSet<Double>(Arrays.asList(12.588, 85.514,
				987.256));
		printCollection(al);
		printCollection(ll);
		printCollection(hs);
		printCollection(ts);
		printCollection(lhs);
	}
}
