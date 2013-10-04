/**
 * 
 */
package interfaces;

import java.util.Random;

import polymorphism.Note;

/**
 * @author Andrew
 * 
 */
abstract class Instrument {
    abstract void play(Note n);

    abstract void adjust();
    abstract String what();
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

    public String toString() {
	return "Wind";
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

    public String toString() {
	return "Percussion";
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

    public String toString() {
	return "Stringed";
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

    public String toString() {
	return "Woodwind";
    }
}

class Accordion extends Instrument {

    @Override
    void play(Note n) {
	// TODO Auto-generated method stub
	System.out.println("Accordion.play() " + n);
    }

    @Override
    void adjust() {
	// TODO Auto-generated method stub
	System.out.println("Adjusting Accordion");
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return "Accordion";
    }
    String what() {
	return "Accordion";
    }

}

class RandomShapeGenerator1 {
    private Random rand = new Random(50);

    public Instrument next() {
	switch (rand.nextInt(6)) {
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
	    return new Accordion();

	}
    }
}

class Music3 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    private static RandomShapeGenerator1 gen = new RandomShapeGenerator1();

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
	Instrument[] orchestra = new Instrument[10];
	for (int i = 0; i < 10; i++)
	    orchestra[i] = gen.next();
	for (Instrument d : orchestra)
	    System.out.println(d);
    }
}

public class Exercise9 extends Music3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
         Music3.main(args);
    }

}
