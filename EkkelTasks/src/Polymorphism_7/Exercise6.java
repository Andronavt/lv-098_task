/**
 * 
 */
package Polymorphism_7;

/**
 * @author ������
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Music3.main(args);

    }

}

class Instrument {
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

class Wind extends Instrument {
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

class Percussion extends Instrument {
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

class Stringed extends Instrument {
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
	return super.toString();
    }
}

class Music3 {
    // Doesn�t care about type, so new types
    // added to the system still work right:
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
	Instrument[] orchestra = { new Wind(), new Percussion(),
		new Stringed(), new Brass(), new Woodwind() };
	for(Instrument i : orchestra){
	    System.out.println(i);
	};
    }
}
