/**
 * 
 */
package HoldingYourObjects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Oleg Exercise 19: (2) Repeat the previous exercise with a HashSet and
 *         LinkedHashSet.
 */
public class Example19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> a= new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(4);
		System.out.println(a);
		Set<Integer> b= new LinkedHashSet<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(5);
		b.add(4);
		System.out.println(b);
	}

}
