/**
 * 
 */
package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg \
 * 
 *         Exercise 2: (1) Repair InfiniteRecursion.java.
 */
public class Example2 {
	public String toString() {
		return " Example2 address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<Example2> v = new ArrayList<Example2>();
		for (int i = 0; i < 10; i++)
			v.add(new Example2());
		System.out.println(v);
	}
}
