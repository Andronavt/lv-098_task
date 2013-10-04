package eckel.holdingyourobjects;

import java.util.HashSet;
import java.util.Set;

/*
 * ex 2
 */

public class SImpleCollection {
    public static void main(String[] args) {
	// Collection<Integer> c = new ArrayList<Integer>();
	Set<Integer> c = new HashSet();
	for (int i = 0; i < 10; i++)
	    c.add(i); // Autoboxing
	for (Integer i : c)
	    System.out.print(i + ", ");
    }

}
