/**
 * 
 */
package Polymorphism_7;

import java.util.Random;

/**
 * @author ¡Ó„‰‡Ì
 *
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Music33.main(args);

    }

}
class Instrument3 {
    void play(Note n) {
	System.out.println("Instrument.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Instrument");
    }
}

class Wind3 extends Instrument3 {
    void play(Note n) {
	System.out.println("Wind.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Wind");
    }
}

class Percussion3 extends Instrument3 {
    void play(Note n) {
	System.out.println("Percussion.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Percussion");
    }
}

class Stringed3 extends Instrument3 {
    void play(Note n) {
	System.out.println("Stringed.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Stringed");
    }
}

class Brass3 extends Wind3 {
    void play(Note n) {
	System.out.println("Brass.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Brass");
    }
}

class Woodwind3 extends Wind3 {
    void play(Note n) {
	System.out.println("Woodwind.play() " + n);
    }

    String what() {
	return super.toString();
    }
}
class Guitar3 extends Instrument3 {
    void play(Note n) {
	System.out.println("Guitar.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Guitar");
    }
}

class Music33{
    // Doesnít care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument3 i) {
	// ...
	i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument3[] e) {
	for (Instrument3 i : e)
	    tune(i);
    }
    
    

    public static void main(String[] args) {
	// Upcasting during addition to the array:
	RandomInstrumentGenerator gener = new RandomInstrumentGenerator();
	for (int i = 0; i < 10; i++) {
	    tune(gener.next());
	}
    }
}
class RandomInstrumentGenerator{
    private Random rand = new Random(47);

    public Instrument3 next() {
	switch (rand.nextInt(3)) {
	default:
	case 0:
	    return new Wind3();
	case 1:
	    return new Percussion3();
	case 2:
	    return new Stringed3();
	case 3:
	    return new Brass3();
	case 4:
	    return new Wind3();
	case 5:
	    return new Guitar3();   
	}
    }
}
