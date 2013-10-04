package eckel.holdingyourobjects;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * ex 24
 */

public class TwentyFour {

    public static void main(String[] args) {
	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	map.put("ten", 10);
	map.put("nine", 9);
	map.put("eight", 8);
	map.put("seven", 7);
	map.put("six", 6);
	map.put("five", 5);
	map.put("four", 4);
	map.put("three", 3);
	map.put("two", 2);
	map.put("one", 1);
	map.put("zero", 0);
	System.out.println("Map to sort: " + map);
	Map<String, Integer> mTemp = new LinkedHashMap<String, Integer>();
	Set<String> ss = new TreeSet<String>(map.keySet());
	Iterator<String> itss = ss.iterator();
	while (itss.hasNext()) {
	    String s = (String) itss.next();
	    Integer i = map.get(s);
	    map.remove(s);
	    mTemp.put(s, i);
	}
	Set<String> ssTemp = new TreeSet<String>(mTemp.keySet());
	Iterator<String> itssTemp = ssTemp.iterator();
	while (itssTemp.hasNext()) {
	    String s = (String) itssTemp.next();
	    Integer i = mTemp.get(s);
	    mTemp.remove(s);
	    map.put(s, i);
	}
	mTemp.clear();
	System.out.println("Sorted map: " + map);
    }
}
