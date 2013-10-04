/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/* Implement reverseSelector( ) in Sequence.java. */
public class Exercise22 {
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
		
		//ReversSelector
		Selector revSelector = sequence.reverseSelector();
		Selector revSel = message.reverseSelector();
		System.out.println();
		while (!revSelector.end()) {
			System.out.print(revSelector.current() + " ");
			revSelector.next();
		}
		
		while (!revSel.end()) {
			System.out.print(revSel.current() + " ");
			revSel.next();
		}
	}
}
