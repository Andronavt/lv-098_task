package eckel.holdingyourobjects;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * ex 14
 */

public class Fourteen {
    static void addM(LinkedList<Integer> l, Integer[] ia) {

	for (Integer i : ia) {
	    ListIterator<Integer> it = l.listIterator((l.size()) / 2);
	    it.add(i);
	    System.out.println(l);
	}
    }

    public static void main(String[] args) {
	LinkedList<Integer> li = new LinkedList<Integer>();
	Integer[] x = { 0, 1, 2, 3, 4, 5, 6, 7 };
	Fourteen.addM(li, x);
    }

}
