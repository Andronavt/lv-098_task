/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Oleg
 * 
 */
public class Example9 {
	private ArrayList<Object> items = new ArrayList<Object>();
	public void add(Object x) {
		items.add(x);
	}
	public Iterator iterator() {
		return items.iterator();
	}
	public static void main(String[] args) {
		Example9 sequence = new Example9();
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Iterator it = sequence.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
