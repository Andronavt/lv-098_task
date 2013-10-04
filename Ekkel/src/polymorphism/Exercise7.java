/**
 * 
 */
package polymorphism;


/**
 * @author orecto
 * 
 */
public class Exercise7 {
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind(), new Drum() };
		Exercise6.tuneAll(orchestra);
		for (Instrument i : orchestra) {
			System.out.println(i);
		}
	}
}
/*
 * Add a new type of Instrument to Music3.java and verify that polymorphism
 * works for your new type
 */