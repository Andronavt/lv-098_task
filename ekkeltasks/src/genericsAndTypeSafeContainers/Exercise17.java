/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Andrew
 * 
 */
/*
 * (2) Take the Gerbil class in Exercise 1 and put it into a Map instead,
 * associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String (the key)
 * for each Gerbil (the value) you put in the table. Get an Iterator for the
 * keySet( ) and use it to move through the Map, looking up the Gerbil for each
 * key and printing out the key and telling the Gerbil to hop( ).
 */
class Gerbil17 {
    int k;

    Gerbil17(int k) {
	this.k = k;
    }

    int hop() {
	return k;
    }

}

public class Exercise17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	HashMap<String, Gerbil17> map = new HashMap<>();
	for (int i = 0; i < 15; i++)
	    map.put("gerbil" + i, new Gerbil17(i + 3));
	Iterator<String> iterator = map.keySet().iterator();
	while (iterator.hasNext()) {
	    String k = iterator.next();
	    System.out.println(k + ": " + map.get(k).hop());
	}
    }

}
