/**
 * 
 */
package Interfaces;

import Polymorphism.Note;

/**
 * @author Oleg
 * 
 */
interface Instrument3 {

	int VALUE = 5;

	void adjust();
}

interface Playable {
	void play(Note n);
}

class Wind3 implements Instrument3, Playable {
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

class Percussion3 implements Instrument3, Playable {
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

class Stringed3 implements Instrument3, Playable {
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

class Brass3 extends Wind3 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind3 extends Wind3 {
	public String toString() {
		return "Woodwing";
	}
}

public class Example10 {
	static void tune(Playable p) {
		// ...
		p.play(Note.MIDDLE_C);
	}
	static void tuneAll(Playable[] e) {
		for (Playable p : e)
			tune(p);
	}
	public static void main(String[] args) {
		Playable[] orchestra = {new Wind3(), new Percussion3(), new Stringed3(),
				new Brass3(), new Woodwind3()};
		tuneAll(orchestra);
	}
}
