package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence9 {
    private List<Object> items = new ArrayList<Object>();

    public void add(Object x) {
	items.add(x);
    }

    public Iterator iterator() {
	return items.iterator();
    }

    public static void main(String[] args) {
	Sequence9 sequence = new Sequence9();
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Iterator it = sequence.iterator();
	while (it.hasNext()) {
	    System.out.print(it.next() + " ");
	}
    }
}
