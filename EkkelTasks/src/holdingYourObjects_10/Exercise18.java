/**
 * 
 */
package holdingYourObjects_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Богдан
 * 
 */
public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Map<String, Integer> hmap = new HashMap();
	Map<String, Integer> tmap = new TreeMap();
	Map<String, Integer> lhmap = new LinkedHashMap();
	for (int i = 0; i < 10; i++) {
	    hmap.put("Key#" + i, i * 10);
	}
	Set<String> keySet1 = hmap.keySet();

	Iterator<String> iter1 = keySet1.iterator();
	while (iter1.hasNext()) {
	    String key = iter1.next();
	    tmap.put(key, hmap.get(key));
	}
	Set<String> keySet2 = tmap.keySet();

	Iterator<String> iter2 = keySet2.iterator();
	while (iter2.hasNext()) {
	    String key = iter2.next();
	    lhmap.put(key, tmap.get(key));
	}
	System.out.println("Sorted LinkedHashMap:");
	Set<String> keySet3 = lhmap.keySet();

	Iterator<String> iter3 = keySet3.iterator();
	while (iter3.hasNext()) {
	    String key = iter3.next();
	    System.out.print("[ " + key + " , " + lhmap.get(key) + " ] ");

	}

    }

}
