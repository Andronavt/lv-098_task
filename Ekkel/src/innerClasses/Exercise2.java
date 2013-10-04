/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create a class that holds a String, and has a toString( ) method that
 * displays this String. Add several instances of your new class to a Sequence
 * object, then display them.
 */
public class Exercise2 {
	public static void main(String[] args) {
		int count = 15;
		Sequence sequence = new Sequence(count);
		for (int i = 0; i < count; i++)
			sequence.add(new StringHolder(Integer.toString(i)));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		StringHolder sh1 = new StringHolder("Peace");
		StringHolder sh2 = new StringHolder("Love");
		StringHolder sh3 = new StringHolder("Easter");

		Sequence message = new Sequence(3);
		message.add(sh1);
		message.add(sh2);
		message.add(sh3);
		Selector sel = message.selector();
		while (!sel.end()) {
			System.out.print(sel.current() + " ");
			sel.next();
		}
	}
}

class StringHolder {
	String str;

	public StringHolder() {
		str = "";
	}

	public StringHolder(String str) {
		this.str = str;
	}

	public String toString() {
		// System.out.println(str);
		return str;
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

	class SequenceSelector implements Selector {
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
		
		public Sequence sequence() {
			return Sequence.this;
		}
	}
	
	class ReverseSelector implements Selector {
		private int i = items.length - 1;

		public boolean end() {
			return i == -1;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i >= 0)
				i--;
		}
		
		public Sequence sequence() {
			return Sequence.this;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public Selector reverseSelector() {
		return new ReverseSelector();
	}

}