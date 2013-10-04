/**
 * 
 */
package genericsAndTypeSafeContainers;

/**
 * @author Andrew
 * 
 */
/*(4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector. */

import java.util.ArrayList;
import java.util.Iterator;

interface Selector9 {
    boolean end();

    Object current();

    void next();
}

class Sequence9 {
    private ArrayList<Object> items;
    private int next = 0;

    public Sequence9() {
	items = new ArrayList<Object>();
    }

    public void add(Object x) {
	items.add(x);
    }

    public Iterator iterator() {
	return items.iterator();
    }

}

public class Exercise9 {

    /**
     * @param args
     */

    public static void main(String[] args) {
	Sequence9 sequence = new Sequence9();
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Iterator<Sequence> iterator = sequence.iterator();
	while (iterator.hasNext()) {
	    System.out.print(iterator.next() + " ");
	}

    }
}