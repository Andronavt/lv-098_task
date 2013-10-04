/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
class Holder {
	String sValue;
	public Holder(String s) {
		sValue = s;
	}
	public String toString() {
		return sValue;
	}
}
interface SelectorInt {
	public Object current();
	void next();
	public boolean end();

}

public class Example2 {
	private Object[] values;
	private int next = 0;
	public Example2(int size) {
		values = new Object[size];
	}
	public void add(Object x) {
		values[next++] = x;
	}
	private class Selector implements SelectorInt {
		private int i = 0;
		public boolean end() {
			return i == values.length;
		}
		public Object current() {
			return values[i];
		}
		public void next() {
			i++;
		}

		public Example2 Example2() { return Example2.this; }
	}
	public Selector makeSelector() {
		return new Selector();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Example2 mainval= new Example2(5);
		for(int i=0;i<5;i++)
		{
			mainval.add(Integer.toString(i));
		}
		SelectorInt  a= mainval.makeSelector();
		while(!a.end()){
			System.out.println(a.current());
			a.next();
		}
	}
}
