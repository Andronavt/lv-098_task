/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * (2) Implement reverseSelector( ) in Sequence.java.
 */
interface Selector22 {
    boolean end();

    Object current();

    void next();
}


    class Sequence22 {
    private Object[] items;
    private int next = 0;

    public Sequence22(int size) {
	items = new Object[size];
    }

    public void add(Object x) {
	if (next < items.length)
	    items[next++] = x;
    }

    private class SequenceSelector implements Selector22 {
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

    public Selector22 selector() {
	return new SequenceSelector();
    }
    public Selector22 reverseSelector()
    {
	return new Selector22() {
	    private int i = items.length-1;
	    @Override
	    public void next() {
		// TODO Auto-generated method stub
		if(i>=0)
		    i--;
	    }
	    
	    @Override
	    public boolean end() {
		// TODO Auto-generated method stub
		return i==(-1);
	    }
	    
	    @Override
	    public Object current() {
		// TODO Auto-generated method stub
		return items[i];
	    }
	};
    }

    public static void main(String[] args) {
	Sequence22 sequence = new Sequence22(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector22 selector = sequence.reverseSelector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
    }
}

public class Exercise22 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
         Sequence22.main(args);
    }

}
