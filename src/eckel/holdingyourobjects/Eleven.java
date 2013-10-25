package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * ex 11
 */

public class Eleven {
    public static void printNig(Collection c) {
	Iterator it = c.iterator();
	while (it.hasNext())
	    System.out.print(it.next() + " ");
	System.out.println();
    }

    public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 5, 9));
	List<Character> ll = new LinkedList<Character>(Arrays.asList('a', 'b',
		'c'));
	HashSet<Float> hs = new HashSet<Float>(Arrays.asList(1.2f, 1.3f, 1.4f));
	TreeSet<Double> ts = new TreeSet<Double>(Arrays.asList(1.123, 2.123,
		3.123));
	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(
		1111, 2222, 3333));
	printNig(al);
	printNig(ll);
	printNig(hs);
	printNig(ts);
	printNig(lhs);
    }

}
