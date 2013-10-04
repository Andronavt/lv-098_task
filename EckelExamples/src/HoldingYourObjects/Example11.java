/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Oleg Exercise 11: (2) Write a method that uses an Iterator to step
 *         through a Collection and print the toString( ) of each object in the
 *         container. Fill all the different types of Collections with objects
 *         and apply your method to each container.
 * 
 * 
 */
class stepping {
	public static void step(Collection c) {
		Iterator<Collection> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Example11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Double> aD = new ArrayList<Double>(Arrays.asList(1.23,1.4,7.5));
		stepping.step(aD);
		HashSet<Integer> hI = new HashSet<Integer>(Arrays.asList(1,24,6));
		stepping.step(hI);
		LinkedList<Character> cL = new LinkedList<Character>(Arrays.asList('a','b','d'));
		stepping.step(cL);
	}

}
