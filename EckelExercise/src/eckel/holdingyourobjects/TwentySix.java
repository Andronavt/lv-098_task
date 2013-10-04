package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import eckel.util.TextFile;

/*
 * ex 26
 */
public class TwentySix {
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
	System.out.println();
	System.out.println("Word locations: " + map);
	// New Map to hold sorted words, keyed by location:
	Map<Integer, String> replay = new TreeMap<Integer, String>();
	Iterator<Map.Entry<String, ArrayList<Integer>>> it = map.entrySet()
		.iterator();
	while (it.hasNext()) {
	    Map.Entry<String, ArrayList<Integer>> me = it.next();
	    for (int i = 0; i < me.getValue().size(); i++)
		replay.put(me.getValue().get(i), me.getKey());
	}
	System.out.println();
	System.out.println("TreeMap of ordered locations, words: " + replay);
	System.out.println();
	// Display words in order as TreeMap values():
	System.out.println("Words in original order: " + replay.values());
    }
}
