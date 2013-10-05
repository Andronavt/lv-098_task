/**
 * 
 */
package HoldingYourObjects;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Oleg
 * 
 *         Exercise 24: (2) Fill a LinkedHashMap with String keys and objects of
 *         your choice. Now extract the pairs, sort them based on the keys, and
 *         reinsert them into the Map.
 */
class MyObj {

}
public class Example24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, MyObj> myMap = new LinkedHashMap<String, MyObj>();
		myMap.put("b", new MyObj());
		myMap.put("x", new MyObj());
		myMap.put("a", new MyObj());
		System.out.println(myMap);
		Map<String, MyObj> myMapMiddle = new LinkedHashMap<String, MyObj>();

		List<String> myList = new LinkedList<String>(myMap.keySet());
		Collections.sort(myList);
		Iterator<String> itList = myList.iterator();
		while (itList.hasNext()) {
			String s = itList.next();
			MyObj i = myMap.get(s);
			myMap.remove(s);
			myMapMiddle.put(s, i);

		}
		List<String> myListMiddle = new LinkedList<String>(myMapMiddle.keySet());
		Iterator<String> it2 = myListMiddle.iterator();
		while (it2.hasNext()) {
			String s = (String) it2.next();
			MyObj i = myMapMiddle.get(s);
			myMapMiddle.remove(s);
			myMap.put(s, i);
		}

		System.out.println(myMap);

	}

}
