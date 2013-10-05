/**
 * 
 */
package HoldingYourObjects;
import java.util.*;

/**
 * @author Oleg
 * 
 * 
 *         Exercise 21: (3) Using a Map<String,Integer>, follow the form of
 *         UniqueWords.java to create a program that counts the occurrence of
 *         words in a file. Sort the results using Collections.sort( ) with a
 *         second argument of String.CASE_INSENSITIVE_ORDER (to produce an
 *         alphabetic sort), and display the result.
 */
public class Example21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> text = new LinkedList<String>(Arrays.asList("one", "two",
				"four", "one", "four", "six"));
		System.out.println(text);
		Collections.sort(text, String.CASE_INSENSITIVE_ORDER);
		System.out.println(text);
		Map<String, Integer> average = new LinkedHashMap<String, Integer>();
		Iterator<String> it = text.iterator();
		Integer allWords=0;
		while (it.hasNext()) {
			String s = it.next();
			if (text.contains(s)) {

				Integer place = average.get(s);
				average.put(s, place == null ? 1 : place+1);
				allWords++;
			}
		}

		System.out.println(average);
		System.out.println(allWords);
		
	}

}
