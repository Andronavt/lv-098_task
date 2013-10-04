/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Andrew
 * 
 */
class SetOperations {

    public static void main(String[] args) {
	Set<String> set1 = new HashSet<String>();
	Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
	set1.add("M");
	System.out.println("H: " + set1.contains("H"));
	System.out.println("N: " + set1.contains("N"));
	Set<String> set2 = new HashSet<String>();
	Collections.addAll(set2, "H I J K L".split(" "));
	System.out.println("set2 in set1: " + set1.containsAll(set2));
	set1.remove("H");
	System.out.println("set1: " + set1);
	System.out.println("set2 in set1: " + set1.containsAll(set2));
	set1.removeAll(set2);
	System.out.println("set2 removed from set1: " + set1);
	Collections.addAll(set1, "X Y Z".split(" "));
	System.out.println("‘X Y Z’ added to set1: " + set1);
    }
}

public class Exercise16 {

    /**
     * @param args
     */
    public static void vowels(HashSet<String> d) {
	Set<Character> vowels = new HashSet<>();
	Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o',
		'u');
	int count = 0;
	int countAll = 0;
	for (String k : d) {
	    for (char c : k.toCharArray()) {
		if (vowels.contains(c)) {
		    count++;
		    countAll++;
		}
	    }
	    System.out.println("Word '" + k + "' contains " + count
		    + " vowels letters");
	    count = 0;
	}
	System.out.println("All vowels letters of the text equal " + countAll);

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	HashSet<String> string = new HashSet<>();
	Collections.addAll(string, "Pryvit", "Mene", "hahaha", "cool",
		"stnad","good", "day");
	vowels(string);

    }

}
