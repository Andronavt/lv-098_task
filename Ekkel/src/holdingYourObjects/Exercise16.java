/**
 * 
 */
package holdingYourObjects;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import staticPack.TextFile;

/**
 * @author orecto
 * 
 */
/*
 * Create a Set of the vowels. Working from UniqueWords.Java, count and display
 * the number of vowels in each input word, and also display the total number of
 * vowels in the input file.
 */
public class Exercise16 {
	static void vowelCounter(Set<String> st) {
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o',
				'u');
		int allVowels = 0;
		for (String s : st) {
			int count = 0;
			for (Character v : s.toCharArray()) {
				if (vowels.contains(v)) {
					count++;
					allVowels++;
				}
			}
			System.out.print(s + ": " + count + ", ");
		}
		System.out.println();
		System.out.print("Total vowels: " + allVowels);
	}

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(new TextFile(
				"Superpuper.txt", "\\W+"));
		System.out.println(words.toString() + '\n');
		vowelCounter(words);
	}
}
