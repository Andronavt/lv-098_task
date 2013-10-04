/**
 * 
 */
package holdingYourObjects_10;

import holdingYourObjects_10.util.TextFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Богдан
 * 
 */
public class Exercise22 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Set<Word> countWords = new HashSet<Word>();
	ArrayList<String> words = new ArrayList(
		new TextFile(
			"d:\\SDevel\\1_JAVA\\1_workspace\\ITAcademy\\eclipse\\EkkelTasks\\src\\holdingYourObjects_10\\SetOperations.java",
			"\\W+"));
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	countWords = vowelsCount(words);
	for (Word w : countWords) {
	    System.out.println(w);
	}
    }

    public static Set<Word> vowelsCount(ArrayList<String> words) {

	Set<Word> wordO = new HashSet<Word>();
	Iterator it = words.iterator();
	while (it.hasNext()) {
	    String s = (String) it.next();
	    int count = 0;
	    for (int i = 0; i < words.size(); i++) {
		if (s.equals(words.get(i)))
		    count++;
	    }
	    Word w = new Word(s, count);
	    wordO.add(w);
	}
	return wordO;
    }
}

class Word {
    private String word;
    private int count;

    Word(String word, int count) {
	this.word = word;
	this.count = count;
    }

    public String toStrind() {
	return "Word: " + word + "; number: " + count;
    }
}
