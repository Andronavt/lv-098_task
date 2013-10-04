/**
 * 
 */
package holdingYourObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author orecto
 * 
 */
/*
 * Take the Gerbil class in Exercise 1 and put it into a Map instead,
 * associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String (the key)
 * for each Gerbil (the value) you put in the table. Get an Iterator for the
 * keySet( ) and use it to move through the Map, looking up the Gerbil for each
 * key and printing out the key and telling the Gerbil to hop( ).
 */
public class Exercise17 {

	class Gerbil {
		private int gerbilNumber;

		public Gerbil(int i) {
			gerbilNumber = i;
		}

		public void hop() {
			System.out.println("Gerbil " + gerbilNumber + " hops.");
		}
	}

	public static void main(String[] args) {
		Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
		for (int i = 0; i < 10; i++) {
			gerbils.put("Fuzzy " + i, new Exercise17().new Gerbil(i));
		}
		Iterator<String> it = gerbils.keySet().iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + ": ");
			gerbils.get(s).hop();
		}
	}
}
