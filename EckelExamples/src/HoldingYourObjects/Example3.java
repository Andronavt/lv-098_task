/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;

/**
 * @author Oleg
 * 
 */
interface Selector {
	boolean end();
	Object current();
	void next();
}
public class Example3 {
	private ArrayList<Object> items = new ArrayList<Object>();
	public void add(Object x) {
		items.add(x);
	}
	private class Sequence3Selector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.size();
		}
		public Object current() {
			return items.get(i);
		}
		public void next() {
			i++;
		}
	}
	public Selector selector() {
		return new Sequence3Selector();
	}
	
	public static void main(String[] args) {
		Example3 ex3 = new Example3();
		for(int i = 0; i < 10; i++)
			ex3.add(i);
		Selector selector = ex3.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		ex3.add(10);
		ex3.add(11);
		ex3.add(12);
		ex3.add(13);
		ex3.add(13);
		ex3.add("last");
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}

}
