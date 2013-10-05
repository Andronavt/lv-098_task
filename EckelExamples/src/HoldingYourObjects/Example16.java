/**
 * 
 */
package HoldingYourObjects;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Oleg
 * 
 *         Exercise 16: (5) Create a Set of the vowels. Working from
 *         UniqueWords.Java, count and display the number of vowels in each
 *         input word, and also display the total number of vowels in the input
 *         file.
 */
class VowelsCounter {
	public static void count(Set<String> s) {
		Set<Character> cS = new TreeSet<Character>();
		Collections.addAll(cS, 'a', 'e', 'i', 'o', 'u');
		int countAll = 0;
		for (String a : s) {
			int countNotAll = 0;
			for (Character c : a.toCharArray()) {
				if (cS.contains(c)) {
					countNotAll++;
					countAll++;
				}
			}
			System.out.println("a has " + countNotAll);
		}
		System.out.println("all vowels " + countAll);
	}
}
public class Example16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> a = new TreeSet<String>();
		a.add("asa");
		a.add("idi");
		a.add("utu");
		VowelsCounter.count(a);
	}

}
