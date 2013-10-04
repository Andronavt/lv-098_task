/**
 * 
 */
package holdingYourObjects_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Богдан
 * 
 */
public class Exercise23 {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	for (int i = 0; i < 2000; i++) {
	    int x = getInt(10000);
	    Integer freq = map.get(x);
	    map.put(x, freq == null ? 1 : freq + 1);
	}
	System.out.println("Most often : " + map);
    }

    private static int getInt(int n) {
	Random rand = new Random();
	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	for (int i = 0; i < 10000; i++) {
	    // Produce a number between 0 and 20:
	    int r = rand.nextInt(20);
	    Integer freq = map.get(r);
	    map.put(r, freq == null ? 1 : freq + 1);
	}
	int max = 0;
	for (int i = 0; i < map.keySet().size(); i++) {
	    max = max < map.get(i) ? map.get(i) : max;
	}
	Set<Map.Entry<Integer, Integer>> me = new LinkedHashSet<Map.Entry<Integer, Integer>>(
		map.entrySet());
	int intPar = 0;
	Iterator<Map.Entry<Integer, Integer>> it = me.iterator();
	while (it.hasNext()) {
	    Map.Entry<Integer, Integer> findMax = it.next();
	    if (findMax.getValue() == max)
		intPar = findMax.getKey();
	}
	return intPar;
    }
}