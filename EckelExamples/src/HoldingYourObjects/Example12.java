/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Oleg
 * 
 */
public class Example12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> iL = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			iL.add(i);
		}
		System.out.println(iL);
		List<Integer> iL2 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
		ListIterator<Integer> it = iL.listIterator(5);
		ListIterator<Integer> it2 = iL2.listIterator();
		while(it.hasNext())
		{
			it.next();
		}
		while(it2.hasNext())
		{
			it2.next();
			it2.set(it.previous());
		}
		System.out.println(iL2);
	}

}
