package eckel.innerclasses;

/*
 * ex 2
 */
class Word {
    private String word;

    public Word(String s) {
	word = s;
    }

    public String toString() {
	return word;
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
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
	    sequence.add(new Word(Integer.toString(i)));
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
	Word w1 = new Word("THis");
	Word w2 = new Word("is");
	Word w3 = new Word("Sparta");
	Sequence message = new Sequence(3);
	message.add(w1);
	message.add(w2);
	message.add(w3);
	Selector sel = message.selector();
	while (!sel.end()) {
	    System.out.print(sel.current() + " ");
	    sel.next();
	}

    }
}
