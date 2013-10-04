/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.ArrayList;

/**
 * @author Andrew
 * 
 */
/*
 * (2) Modify innerclasses/Sequence.java so that you can add any number of
 * elements to it.
 */

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private ArrayList<Object> items;

    public Sequence() {
	items = new ArrayList<Object>();
    }

    public void add(Object x) {
	items.add(x);
    }

    private class SequenceSelector implements Selector {
	private int i = 0;

	public boolean end() {
	    return i == items.size();
	}

	public Object current() {
	    return items.get(i);
	}

	public void next() {
		i++;
	}
    }

    public Selector selector() {
	return new SequenceSelector();
    }

}

public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sequence sequence = new Sequence();
	for (int i = 0; i < 25; i++)
	    sequence.add(Integer.toString(i));
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}

    }
}
