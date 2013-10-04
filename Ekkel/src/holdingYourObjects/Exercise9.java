/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author orecto
 * 
 */
/*
 * Modify innerclasses/Sequence.java so that Sequence works with an Iterator
 * instead of a Selector
 */
public class Exercise9 {
	private ArrayList<Object> list = new ArrayList<Object>();

	public void add(Object obj) {
		list.add(obj);
	}

	public Iterator <Object> iterator() {
		return list.iterator();
	}

	public static void main(String[] args) {
		Exercise9 sequence = new Exercise9();
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i + 5));
		Iterator <Object> it = sequence.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
