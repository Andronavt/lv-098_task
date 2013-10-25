package eckel.polymorphism;

class Instrument {
    void play(Note n) {
	System.out.println("Instrument.play() " + n);
    }

    String what() {
	return "Instrument";
    }

    void adjust() {
	System.out.println("Adjusting Instrument");
    }

    public String toString() {
	return "instrument";
    }
}

class Wind extends Instrument {
    void play(Note n) {
	System.out.println("Wind.play() " + n);
    }

    String what() {
	return "Wind";
    }

    void adjust() {
	System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
	System.out.println("Percussion.play() " + n);
    }

    String what() {
	return "Percussion";
    }

    void adjust() {
	System.out.println("Adjusting Percussion");
    }
}

class Keyboards extends Instrument {

    void play(Note n) {
	System.out.println("Keyboards.play() " + n);
    }

    String what() {
	return "Keyboard";
    }

    void adjut() {
	System.out.println("Adustring Keyboards");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
	System.out.println("Stringed.play() " + n);
    }

    String what() {
	return "Stringed";
    }

    void adjust() {
	System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
	System.out.println("Brass.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
	System.out.println("Woodwind.play() " + n);
    }

    String what() {
	return "Woodwind";
    }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    private static RandromInstrumentGenerator gen = new RandromInstrumentGenerator();

    public static void tune(Instrument i) {
	// ...
	i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
	for (Instrument i : e)
	    tune(i);
    }

    public static void main(String[] args) {
	// Upcasting during addition to the array:
	// Instrument[] orchestra = { new Wind(), new Percussion(),
	// new Stringed(), new Brass(), new Woodwind(), new Keyboards() };
	Instrument[] orchestra = new Instrument[6];
	for (int i = 0; i < orchestra.length; i++) {
	    orchestra[i] = gen.next();
	}
	tuneAll(orchestra);
    }
}
