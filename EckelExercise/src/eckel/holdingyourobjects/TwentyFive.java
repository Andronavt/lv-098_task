package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import eckel.util.TextFile;

/*
 * ex 25
 */

public class TwentyFive {
    public static void main(String[] args) {
	Map<String, ArrayList<Integer>> map = new LinkedHashMap<String, ArrayList<Integer>>();
	List<String> words = new LinkedList<String>();
	words.addAll(new TextFile("SetOperations.java", "\\W+"));
	System.out.println("Words in file: " + words);
	Iterator itWords = words.iterator();
	int count = 0;
	while (itWords.hasNext()) {
	    String s = (String) itWords.next();
	    count++;
	    if (!map.keySet().contains(s)) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(0, count);
		map.put(s, ai);
	    } else {
		map.get(s).add(count);
		map.put(s, map.get(s));
	    }
	}
	System.out.println("Word locations: " + map);
    }

}
