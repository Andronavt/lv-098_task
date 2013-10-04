/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import staticPack.TextFile;

/**
 * @author orecto
 * 
 */
/*
 * Using a Map<String,Integer>, follow the form of UniqueWords.java to create a
 * program that counts the occurrence of words in a file. Sort the results using
 * Collections.sort( ) with a second argument of String.CASE_INSENSITIVE_ORDER
 * (to produce an alphabetic sort), and display the result.
 */
public class Exercise21 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile(
				"Superpuper.txt", "\\W+"));
		System.out.println("Words to count: " + words + '\n');
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> wordsAppearance = new LinkedHashMap<String, Integer>();
		Iterator <String> it = words.iterator();
		int totalWords = 0;
		while (it.hasNext()) {
			String s = (String) it.next();
			if (words.contains(s)) {
				Integer counterOfWords = wordsAppearance.get(s);
				wordsAppearance.put(s, counterOfWords == null ? 1 : counterOfWords + 1);
				totalWords++;
			}
		}
		System.out.println("Word count: " + wordsAppearance + '\n');
		System.out.println("Total words: " + totalWords);
	}
}
