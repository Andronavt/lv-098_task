/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	SWgenerator swg = new SWgenerator();
	ArrayList<String> al = new ArrayList<>();
	LinkedList<String> ll = new LinkedList<>();
	HashSet<String> hs = new HashSet<>();
	LinkedHashSet<String> lhs = new LinkedHashSet<>();
	TreeSet<String> ts = new TreeSet<>();
	for (int i = 0; i < 5; i++) {
	    al.add(swg.next());
	    ll.add(swg.next());
	    hs.add(swg.next());
	    lhs.add(swg.next());
	    ts.add(swg.next());
	}
	for (String s : al) {
	    System.out.println("ArrayList: " + s);
	}
	for (String s : ll) {
	    System.out.println("LinkedList: " + s);
	}
	for (String s : hs) {
	    System.out.println("HashSet: " + s);
	}
	for (String s : lhs) {
	    System.out.println("LinkedHashSet: " + s);
	}
	for (String s : ts) {
	    System.out.println("TreeSet: " + s);
	}

    }

}

class SWgenerator {
    static int count = 0;
    String[] array = new String[] { "Anakin Skywalker", "Darth Vader",
	    "Princess Leia Organa", "Luke Skywalker", "Palpatine",
	    "Padme Amidala", "Obi-Wan Kenobi", "Yoda", "R2-D2",
	    "General Grievous", "Chewbacca", "Han Solo", "Jabba the Hutt",
	    "C-3PO" };

    public String next() {
	if (count == array.length)
	    count = 0;
	return array[count++];

    }
}
