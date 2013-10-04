/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Andrew
 * 
 */
/*
 * (3) Create an empty LinkedList<Integer>. Using a Listlterator, add Integers
 * to the List by always inserting them in the middle of the List.
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedList<Integer> list = new LinkedList<Integer>();
	ListIterator<Integer> iterator;
	for (int i = 0; i < 15; i++) {
	    iterator = list.listIterator(list.size() / 2);
	    iterator.add(i);
	    System.out.println(list);
	}
    }
}
