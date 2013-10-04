/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;

/**
 * @author Богдан
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sequence.main(args);

    }

}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private ArrayList items;
    private int next = 0;

    public Sequence() {
	items = new ArrayList();
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

    public static void main(String[] args) {
	Sequence sequence = new Sequence();
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
    }
}
