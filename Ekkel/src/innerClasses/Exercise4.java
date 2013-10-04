/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Add a method to the class Sequence.SequenceSelector that produces the
 * reference to the outer class Sequence
 */
public class Exercise4 {
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
		System.out.println(((Sequence.SequenceSelector) selector).sequence()
				.getClass().getName());
	}
}
