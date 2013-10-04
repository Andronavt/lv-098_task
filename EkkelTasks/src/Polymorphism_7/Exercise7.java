/**
 * 
 */
package Polymorphism_7;

/**
 * @author ¡Ó„‰‡Ì
 *
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Music32.main(args);

    }

}
class Instrument2 {
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

class Wind2 extends Instrument2 {
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

class Percussion2 extends Instrument2 {
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

class Stringed2 extends Instrument2 {
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

class Brass2 extends Wind2 {
    void play(Note n) {
	System.out.println("Brass.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Brass");
    }
}

class Woodwind2 extends Wind2 {
    void play(Note n) {
	System.out.println("Woodwind.play() " + n);
    }

    String what() {
	return super.toString();
    }
}
class Guitar extends Instrument2 {
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

class Music32 {
    // Doesnít care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument2 i) {
	// ...
	i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument2[] e) {
	for (Instrument2 i : e)
	    tune(i);
    }

    public static void main(String[] args) {
	// Upcasting during addition to the array:
	Instrument2[] orchestra = { new Wind2(), new Percussion2(),
		new Stringed2(), new Brass2(), new Woodwind2(), new Guitar() };
	for(Instrument2 i : orchestra){
	    i.adjust();
	};
    }
}
