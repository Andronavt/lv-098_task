/**
 * 
 */
package HoldingYourObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Oleg
 * 
 *         Exercise 17: (2) Take the Gerbil class in Exercise 1 and put it into
 *         a Map instead, associating each Gerbil’s name (e.g. "Fuzzy" or
 *         "Spot") as a String (the key) for each Gerbil (the value) you put in
 *         the table. Get an Iterator for the keySet( ) and use it to move
 *         through the Map, looking up the Gerbil for each key and printing out
 *         the key and telling the Gerbil to hop( ).
 */

class Gerbill {
	private int a;
	Gerbill(int a) {
		this.a = a;
	}
	void hop() {
		System.out.println(a + " Gerbil Hopping ");
	}
}

public class Example17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Gerbill> gerMap = new HashMap<String, Gerbill>();
		gerMap.put("name1", new Gerbill(1));
		gerMap.put("name2", new Gerbill(2));
		gerMap.put("name3", new Gerbill(3));
		Iterator<String> it = gerMap.keySet().iterator();
		while (it.hasNext()) {
			String val = it.next();
			System.out.println("val "+val);
			gerMap.get(val).hop();
		}

	}

}
