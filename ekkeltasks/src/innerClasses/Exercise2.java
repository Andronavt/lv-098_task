/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * 
 */

class Test2 {
    private String name;

    Test2(String s) {
	this.name = s;
    }

    @Override
    public String toString() {
	return name;
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

    public static void main(String[] args) {
	Sequence sequence = new Sequence(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(new Test2("haha"+i));
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.println(selector.current() + " ");
	    selector.next();
	}
    }
}

public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Sequence.main(args);

    }

}
