package eckel.holdingyourobjects;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import eckel.util.*;
/*
 * ex 16
 */


public class Sixteen {
    static void count(Set<String> st) {
	Set<Character> vowels = new TreeSet<Character>();
	Collections.addAll(vowels, 'N', 'A', 'I', 'S', 'G', 'W', 'E', 'i', 'R',
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
	System.out.print("numbers of vowels: " + allVowels);
    }

    public static void main(String[] args) {
	Set<String> set = new TreeSet<String>(new TextFile(
		"SetOperations.java", "\\W+"));
	System.out.println(set);
	System.out.println();
	count(set);
    }
}
