/**
 * 
 */
package holdingYourObjects_10;

import holdingYourObjects_10.util.TextFile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Богдан
 * 
 */
public class Exercise21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Map<String, Integer> countMap = new LinkedHashMap<>();
	ArrayList<String> words = new ArrayList(
		new TextFile(
			"d:\\SDevel\\1_JAVA\\1_workspace\\ITAcademy\\eclipse\\EkkelTasks\\src\\holdingYourObjects_10\\SetOperations.java",
			"\\W+"));
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	countMap = vowelsCount(words);
	System.out.println(countMap.toString());

    }

    public static LinkedHashMap<String, Integer> vowelsCount(
	    ArrayList<String> words) {
	LinkedHashMap<String, Integer> wordsCount = new LinkedHashMap();
	Iterator it = words.iterator();
	while (it.hasNext()) {
	    String s = (String) it.next();
	    if (words.contains(s)) {
		Integer count = wordsCount.get(s);
		wordsCount.put(s, count == null ? 1 : count + 1);
	    }
	}
	return wordsCount;
    }
}
