package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
 * ex 12
 */

public class Twelve {
    public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
	List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
	ListIterator<Integer> it1 = l1.listIterator();
	ListIterator<Integer> it2 = l2.listIterator();
	System.out.println("li1: " + l1);
	System.out.println("li2: " + l2);
	while (it1.hasNext())
	    it1.next();
	while (it2.hasNext()) {
	    it2.next();
	    it2.set(it1.previous());
	}
	System.out.println("li1: " + l1);
	System.out.println("li2: " + l2);
    }

}
