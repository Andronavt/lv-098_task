/**
 * 
 */
package HoldingYourObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Oleg
 * 
 * 
 *         Exercise 22: (5) Modify the previous exercise so that it uses a class
 *         containing a String and a count field to store each different word,
 *         and a Set of these objects to maintain the list of words.
 */

class MyClass1 {
	String word;
	int count;
	MyClass1(String word, int count) {
		this.word = word;
		this.count = count;
	}
	public String toString() {
		return word + " occures " + count + " times";
	}
}
public class Example22 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		List<String> text = new LinkedList<String>(Arrays.asList("one", "two",
				"four", "one", "four", "six"));
		System.out.println(text);
		Collections.sort(text, String.CASE_INSENSITIVE_ORDER);
		System.out.println(text);
		Set<MyClass1> myArray = new HashSet<MyClass1>();
		Iterator<String> it = text.iterator();
		Integer allWords = 0;
		while (it.hasNext()) {
			String s = it.next();
			int count = 0;
			for (int i = 0; i < text.size(); i++) {
				if (s.equals(text.get(i)))
					count++;
			}
			MyClass1 myVal = new MyClass1(s, count);
			myArray.add(myVal);
		}
		System.out.println(myArray);

	}

}
