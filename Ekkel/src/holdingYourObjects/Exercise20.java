/**
 * 
 */
package holdingYourObjects;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import staticPack.TextFile;

/**
 * @author orecto
 * 
 */
/*
 * Modify Exercise 16 so that you keep a count of the occurrence of each vowel.
 */
public class Exercise20 {
	static void vowelCounter(Set<String> strArr) {
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o',
				'u');
		int allVowels = 0;
		Map<Character, Integer> vowelTreeMap = new TreeMap<Character, Integer>();
		for (String s : strArr) {
			for (Character v : s.toCharArray()) {
				if (vowels.contains(v)) {
					Integer countAppearance = vowelTreeMap.get(v);
					vowelTreeMap.put(v, countAppearance == null ? 1 : countAppearance + 1);
					allVowels++;
				}
			}
		}
		System.out.println("Vowels: " + vowelTreeMap);
		System.out.println();
		System.out.print("Total vowels: " + allVowels);
	}

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(new TextFile("Superpuper.txt",
				"\\W+"));
		System.out.println(words.toString() + '\n');
		vowelCounter(words);
	}
}
