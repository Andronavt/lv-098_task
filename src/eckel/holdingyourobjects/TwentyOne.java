package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import eckel.util.TextFile;

/*
 * ex 21
 */

public class TwentyOne {
    public static void main(String[] args) {
	List<String> words = new ArrayList<String>(new TextFile(
		"SetOperations.java", "\\W+"));
	System.out.println("Words to count: " + words);
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
	Iterator it = words.iterator();
	int totalWords = 0;
	while (it.hasNext()) {
	    String s = (String) it.next();
	    if (words.contains(s)) {
		Integer count = wordCount.get(s);
		wordCount.put(s, count == null ? 1 : count + 1);
		totalWords++;
	    }
	}
	System.out.println();
	System.out.println("Word count: " + wordCount);
	System.out.println();
	System.out.println("Total words: " + totalWords);
    }
}
