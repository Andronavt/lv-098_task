/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 *
 */
import java.util.Random;

import polymorphism.Note;

/**
 * @author Andrew
 * 
 */
interface Playable {
    void play(Note n);
}

abstract class Instrument1 {

    abstract void adjust();

    abstract String what();
}

class Wind1 extends Instrument1 implements Playable {
    public void play(Note n) {
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

class Percussion1 extends Instrument1 implements Playable {
    public void play(Note n) {
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

class Stringed1 extends Instrument1 implements Playable {

    public void play(Note n) {
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

class Brass1 extends Wind1 {
    public void play(Note n) {
	System.out.println("Brass.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Brass");
    }
}

class Woodwind1 extends Wind1 {
    public void play(Note n) {
	System.out.println("Woodwind.play() " + n);
    }

    String what() {
	return "Woodwind";
    }

    public String toString() {
	return "Woodwind";
    }
}

class Accordion1 extends Instrument1 implements Playable {

    @Override
    public void play(Note n) {
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

class RandomShapeGenerator11 {
    private Random rand = new Random(50);

    public Playable next() {
	switch (rand.nextInt(6)) {
	default:
	case 0:
	    return new Wind1();
	case 1:
	    return new Percussion1();
	case 2:
	    return new Stringed1();
	case 3:
	    return new Brass1();
	case 4:
	    return new Woodwind1();
	case 5:
	    return new Accordion1();

	}
    }
}

class Music31 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    private static RandomShapeGenerator11 gen = new RandomShapeGenerator11();

    public static void tune(Playable i) {
	// ...
	i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Playable[] e) {
	for (Playable i : e)
	    tune(i);
    }

    public static void main(String[] args) {
	// Upcasting during addition to the array:
	Playable[] orchestra = new Playable[10];
	for (int i = 0; i < 10; i++)
	    orchestra[i] = gen.next();
	for (Playable d : orchestra)
	    System.out.println(d);
    }
}

public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Music31.main(args);

    }

}
