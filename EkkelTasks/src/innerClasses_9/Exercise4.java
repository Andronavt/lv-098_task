/**
 * 
 */
package innerClasses_9;



/**
 * @author Богдан
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	

    }

}

interface Selector2 {
    boolean end();

    Object current();

    void next();
}

class Sequence2 {
    private Object[] items;
    private int next = 0;

    public Sequence2(int size) {
	items = new Object[size];
    }

    public void add(Object x) {
	if (next < items.length)
	    items[next++] = x;
    }

    private class SequenceSelector implements Selector2 {
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

	public Sequence2 seqRef() {
	    return Sequence2.this;
	}
    }

    public Selector2 selector() {
	return new SequenceSelector();
    }
}
