/**
 * 
 */
package holdingYourObjects_10;

import holdingYourObjects_10.util.TextFile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Богдан
 * 
 */
public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int allVowels = 0;

	Set<String> words = new TreeSet<String>(
		new TextFile(
			"d:\\SDevel\\1_JAVA\\1_workspace\\ITAcademy\\eclipse\\EkkelTasks\\src\\holdingYourObjects_10\\SetOperations.java",
			"\\W+"));
	for (String s : words) {
	    System.out.println("in word { " + s + " } is " + vowelsInWord(s)
		    + " vowels.");
	    allVowels += vowelsInWord(s);
	}
	System.out.println("In all file is " + allVowels + " volves.");
	Set<Character> keySet = vowelsCount(words).keySet();
	Iterator<Character> iter = keySet.iterator();
	while (iter.hasNext()) {
	    Character ch = iter.next();
	    System.out.println("Vowels " + ch + " repeats "
		    + vowelsCount(words).get(ch));
	}

    }

    public static int vowelsInWord(String word) {
	int count = 0;
	char[] vowels = new char[] { 'E', 'Y', 'U', 'I', 'O', 'A', 'e', 'y',
		'u', 'i', 'o', 'a' };
	char[] wordAr = word.toCharArray();
	for (int i = 0; i < wordAr.length; i++) {
	    for (int j = 0; j < vowels.length; j++) {
		if (wordAr[i] == vowels[j]) {
		    count++;
		}
	    }

	}
	return count;
    }

    public static Map<Character, Integer> vowelsCount(Set<String> words) {
	HashMap<Character, Integer> count = new HashMap();
	int tmp;
	char[] vowels = new char[] { 'E', 'Y', 'U', 'I', 'O', 'A', 'e', 'y',
		'u', 'i', 'o', 'a' };
	for (Character ch : vowels) {
	    count.put(ch, 0);
	}
	for (String word : words) {
	    char[] wordAr = word.toCharArray();
	    for (int i = 0; i < wordAr.length; i++) {
		for (int j = 0; j < vowels.length; j++) {
		    if (wordAr[i] == vowels[j]) {
			switch (vowels[j]) {
			case 'E':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'Y':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'U':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'I':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'O':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'A':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'e':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'y':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'u':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'i':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'o':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			case 'a':
			    tmp = count.get(vowels[j]);
			    count.put(vowels[j], tmp + 1);
			    break;
			default:
			    break;
			}

		    }
		}

	    }
	}
	return count;
    }
}