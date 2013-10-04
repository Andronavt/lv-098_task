/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sequence sequence = new Sequence(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(new Test2(i).toString());
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();

	}

    }
}

class Test2 {
    String s;

    public Test2(int i) {
	s = String.valueOf(i);
    }

    public String toString() {
	return s;
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

    public void add(Object x) {
	if (next < items.length)
	    items[next++] = x;
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
}
