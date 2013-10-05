/**
 * 
 */
package HoldingYourObjects;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Oleg Exercise 18: (3) Fill a HashMap with key-value pairs. Print the
 *         results to show ordering by hash code. Extract the pairs, sort by
 *         key, and place the result into a LinkedHashMap. Show that the
 *         insertion order is maintained.
 */
public class Example18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> a = new HashMap<Integer, Integer>();
		a.put(4, 4);
		a.put(3, 3);
		a.put(2, 2);
		a.put(1, 1);
		a.put(5, 1);
		System.out.println(a);
		Map<Integer, Integer> b = new LinkedHashMap<Integer, Integer>();
		b.put(4, 4);
		b.put(3, 3);
		b.put(2, 2);
		b.put(1, 1);
		b.put(5, 1);
		System.out.println(b);
	}

}
