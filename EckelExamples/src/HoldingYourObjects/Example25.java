/**
 * 
 */
package HoldingYourObjects;
import java.util.*;
/**
 * @author Oleg
 * 
 *         Exercise 25: (3) Create a Map<String,ArrayList<Integer>>. Use
 *         net.mindview.TextFile to open a text file and read it in a word at a
 *         time (use "\\W+" as the second argument to the TextFile constructor).
 *         Count the words as you read them in, and for each word in the file,
 *         record in the ArrayList<Integer> the word count associated with that
 *         word—this is, in effect, the location in the file where that word was
 *         found.
 */
public class Example25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> myMap = new LinkedHashMap<String, ArrayList<Integer>>();
		List<String> text = new LinkedList<String>(Arrays.asList("one", "two",
				"four", "one", "four", "six"));
		Iterator<String> it = text.iterator();
		int count = 0;
		while (it.hasNext()) {
			String current = it.next();
			count++;
			if (!myMap.keySet().contains(current)) {
				ArrayList<Integer> aver = new ArrayList<Integer>();
				aver.add(0, count);
				myMap.put(current, aver);

			} else {
				myMap.get(current).add(count);
				myMap.put(current, myMap.get(current));
			}
		}

		System.out.println(myMap);

		Map<Integer, String> recreation = new TreeMap<Integer, String>();
		Iterator<Map.Entry<String, ArrayList<Integer>>> it2 = myMap.entrySet()
				.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, ArrayList<Integer>> me = it2.next();
			for (int i = 0; i < me.getValue().size(); i++)
				recreation.put(me.getValue().get(i), me.getKey());
		}

		System.out.println(recreation);
	}

}
