/**
 * 
 */
package Interfaces;

import Polymorphism.Note;

/**
 * @author Oleg
 * 
 */
abstract class Instrument {
	private int i;
	public abstract void play(Note n);
	public String toString() {
		return "Instrument";
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {
		return "Wind";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {
		return "Percussion";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() {
		return "Stringed";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwing";
	}
}
public class Example9 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(),
				new Brass(), new Woodwind()};
		tuneAll(orchestra);
	}

}
