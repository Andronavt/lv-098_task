/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Oleg
 *Exercise 14:   (3) Create an empty LinkedList<Integer>. Using a Listlterator, add 
Integers to the List by always inserting them in the middle of the List.  

 */

public class Example14 {

	static public void addMiddle(LinkedList<Integer> list, Integer a){
		ListIterator<Integer> it = list.listIterator(list.size()/2);
		it.add(a);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(0,0,0,0,0));
		addMiddle(list, 1);
		addMiddle(list, 2);
		addMiddle(list, 3);
		System.out.println(list);
		
		
	}

}
