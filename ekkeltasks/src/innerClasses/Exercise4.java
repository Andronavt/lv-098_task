/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * 
 */

interface Selector1 {
    boolean end();

    Object current();

    void next();
}

class Sequence1 {
    private Object[] items;
    private int next = 0;

    public Sequence1(int size) {
	items = new Object[size];
    }

    public void add(Object x) {
	if (next < items.length)
	    items[next++] = x;
    }

    private class SequenceSelector1 implements Selector1 {
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
	public Sequence1 ret()
	{
	    return Sequence1.this;
	}
    }

    public Selector1 selector() {
	return new SequenceSelector1();
    }

    public static void main(String[] args) {
	Sequence1 sequence = new Sequence1(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector1 selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
    }
}

public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Sequence1.main(args);
	

    }

}
