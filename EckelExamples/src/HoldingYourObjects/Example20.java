/**
 * 
 */
package HoldingYourObjects;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Oleg
 * 
 *         Exercise 20: (3) Modify Exercise 16 so that you keep a count of the
 *         occurrence of each vowel.
 */

class VowelsCounterWithAverage {
	public static void count(Set<String> s) {
		Map<Character, Integer> cS = new TreeMap<Character, Integer>();
		cS.put('a', 0);
		cS.put('e', 0);
		cS.put('i', 0);
		cS.put('o', 0);
		cS.put('u', 0);
		int countAll = 0;
		for (String a : s) {
			int countNotAll = 0;
			for (Character c : a.toCharArray()) {
				if (cS.containsKey(c)) {
					Integer val = cS.get(c);
					countNotAll++;
					countAll++;
					cS.put(c, val == 0 ? 1 : val + 1);
				}
			}
			System.out.println("a has " + countNotAll);
		}
		System.out.println("all vowels " + countAll);
		System.out.println(cS);
	}
}

public class Example20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> a = new TreeSet<String>();
		a.add("asa");
		a.add("idi");
		a.add("utu");
		VowelsCounterWithAverage.count(a);
	}

}
