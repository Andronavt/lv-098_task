/**
 * Exercise 12:   (3) Modify innerclasses/Sequence.java so that it throws an appropriate
 * exception if you try to put in too many elements.
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise12 {

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
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
	items = new Object[size];
    }

    public void add(Object x) throws ToMuchException {

	if (next < items.length)
	    items[next] = x;
	next++;
	if (next > items.length)
	    throw new ToMuchException(
		    "You cant add new element because Sequance is foll!!!!");
    }

    private class SequenceSelector implements Selector {
	private int i = 0;

	public boolean end() {
	    return i == items.length;
	}

	public Object current() {
	    return items[i];
	}

	public void next() {
	    if (i < items.length)
		i++;
	}
    }

    public Selector selector() {
	return new SequenceSelector();
    }

    public static void main(String[] args) {
	Sequence sequence = new Sequence(10);
	try {
	    for (int i = 0; i < 11; i++)
		sequence.add(Integer.toString(i));

	} catch (ToMuchException e) {
	    e.printStackTrace();
	}
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
    }
}

class ToMuchException extends Exception {
    public ToMuchException() {

    }

    public ToMuchException(String msg) {
	super(msg);
    }
}