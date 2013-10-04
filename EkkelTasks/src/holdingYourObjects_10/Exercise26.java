/**
 * 
 */
package holdingYourObjects_10;

import holdingYourObjects_10.util.TextFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author Богдан
 * 
 */
public class Exercise26 {
    private static int position;
    private static int length;

    /**
     * @param args
     */
    public static void main(String[] args) {
	ArrayList<String> words = new ArrayList<String>(new TextFile(
		"Readme.txt", "\\W+"));
	LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap();
	System.out.println(words.toString());
	length = words.size();
	for (; position < words.size(); position++) {
	    addToMap(map, words.get(position));
	}
	System.out.println(map.toString());

    }

    public static void addToMap(LinkedHashMap<String, ArrayList<Integer>> map,
	    String word) {

	if (map.containsKey(word)) {
	    ArrayList<Integer> tmp = map.get(word);
	    tmp.add(position);
	    map.put(word, tmp);
	} else {
	    ArrayList<Integer> tmp = new ArrayList();
	    tmp.add(position);
	    map.put(word, tmp);
	}
    }
    
    public static void getFromMap(LinkedHashMap<String, ArrayList<Integer>> map){
	Iterator iterator =
    }
    
}
