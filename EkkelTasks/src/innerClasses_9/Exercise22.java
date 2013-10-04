/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise22 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sequence3.main(args);

    }

}

interface Selector3 {
    boolean end();

    Object current();

    void next();
}

class Sequence3 {
    private Object[] items;
    private int next = 0;

    public Sequence3(int size) {
	items = new Object[size];
    }

    public void add(Object x) {
	if (next < items.length)
	    items[next++] = x;
    }

    

    public Selector3 selector() {
	return new reverceSelector();
    }
    
    private class reverceSelector implements Selector3 {
  	private int i = items.length - 1;

  	public boolean end() {
  	    return i == 0;
  	}

  	public Object current() {
  	    return items[i];
  	}

  	public void next() {
  	    if (i >= 0)
  		i--;
  	}
      }

    public static void main(String[] args) {
	Sequence3 sequence = new Sequence3(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector3 selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
    }
}
