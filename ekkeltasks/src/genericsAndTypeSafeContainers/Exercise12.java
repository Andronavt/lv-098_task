/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author Andrew
 * 
 */
/*
 * Create and populate a List<Integer>. Create a second List<Integer> of the
 * same size as the first, and use ListIterator to read elements of the first
 * List and insert them into the second in reverse order. (You may want to
 * explore a number of different ways to solve this problem.)
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static ArrayList<Integer> fill(int length) {
	Random rand = new Random();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	for (int i = 0; i < length; i++) {
	    list1.add(rand.nextInt(100));
	}
	return list1;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Integer> list1 = fill(15);
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	System.out.println(list1);
	ListIterator<Integer> listiterator = list1.listIterator(list1.size());
	while (listiterator.hasPrevious()) {
	    list2.add(listiterator.previous());
	}
	System.out.println(list2);

    }

}
