/**
 * 
 */
package Polymorphism;

import java.util.Random;

/**
 * @author Oleg
 * 
 */

class Instrument {
    void play(Note n) {
	System.out.println("Instrument.play() " + n);
    }

    public String toString() {
	return "Instrument";
    }

    void adjust() {
	System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
	System.out.println("Wind.play() " + n);
    }

    public String toString() {
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

    public String toString() {
	return "Percussion";
    }

    void adjust() {
	System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {

    void play(Note n) {
	System.out.println("Stringed.play() " + n);
    }

    public String toString() {
	return "Stringed";
    }

    void adjust() {
	System.out.println("Adjusting Stringed");
    }
}

class MyInstr extends Instrument {
    void play(Note n) {
	System.out.println("MYINSTR.play() " + n);
    }

    public String toString() {
	return "MyInstr";
    }

    void adjust() {
	System.out.println("Adjusting MyInstr");
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

    public String toString() {
	return "Woodwind";
    }
}

class RandomInstrGen {
    private Random rand = new Random(47);

    public Instrument next() {
	switch (rand.nextInt(5)) {
	default:
	case 0:
	    return new Wind();
	case 1:
	    return new Percussion();
	case 2:
	    return new Stringed();
	case 3:
	    return new Brass();
	case 4:
	    return new Woodwind();
	case 5:
	    return new MyInstr();
	}
    }
}

public class Example678 {

    public static void tune(Instrument i) {
	// ...
	i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
	for (Instrument i : e)
	    tune(i);
    }

    public static void showall(Instrument[] e) {
	for (Instrument i : e)
	    System.out.println(i);
    }

    private static RandomInstrGen randins = new RandomInstrGen();

    public static void main(String[] args) {
	Instrument[] orchestra2 = new Instrument[9];
	for (int i=0;i<orchestra2.length;i++) {
	   orchestra2[i]=randins.next();
	}
	Instrument[] orchestra = { new Wind(), new Percussion(),
		new Stringed(), new Brass(), new Woodwind(), new MyInstr() };
	tuneAll(orchestra);
	showall(orchestra);
	tuneAll(orchestra2);
	showall(orchestra2);
    }

}
