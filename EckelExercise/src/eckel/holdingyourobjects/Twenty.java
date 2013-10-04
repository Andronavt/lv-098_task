package eckel.holdingyourobjects;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import eckel.util.TextFile;

/*
 * ex 20
 */

public class Twenty {
    static void count(Set<String> st) {
	Set<Character> vowels = new TreeSet<Character>();
	Collections.addAll(vowels, 'N', 'A', 'I', 'S', 'G', 'W', 'E', 'i', 'R',
		'u');
	int allVowels = 0;
	Map<Character, Integer> vowelMap = new TreeMap<Character, Integer>();
	for (String s : st) {
	    for (Character v : s.toCharArray()) {
		if (vowels.contains(v)) {
		    Integer count = vowelMap.get(v);
		    vowelMap.put(v, count == null ? 1 : count + 1);
		    allVowels++;
		}
	    }
	}
	System.out.println("Vowels: " + vowelMap);
	System.out.println("numbers of vowels: " + allVowels);
    }

    public static void main(String[] args) {
	Set<String> set = new TreeSet<String>(new TextFile(
		"SetOperations.java", "\\W+"));
	System.out.println(set);
	System.out.println();
	count(set);
    }

}
