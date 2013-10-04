package eckel.interfaces;

import eckel.polymorphism.Note;

/*
 * Exercise 9 - 10
 */

interface Playable {
    public abstract void play(Note n);
}

abstract class Instrument {
    // Compile-time constant:

    // Cannot have method definitions:
    // public abstract void play(Note n); // Automatically public

    public abstract void adjust();

    public String toString() {
	return "Instrument";
    }
}

class Wind extends Instrument implements Playable {
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

class Percussion extends Instrument implements Playable {
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

class Stringed extends Instrument implements Playable {
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
	return "Woodwind";
    }
}

public class Musics {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Playable p) {
	// ...
	p.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] playable) {
	for (Playable p : playable)
	    tune(p);
    }

    public static void main(String[] args) {
	// Upcasting during addition to the array:
	Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(),
		new Brass(), new Woodwind() };
	tuneAll(orchestra);
    }
}
