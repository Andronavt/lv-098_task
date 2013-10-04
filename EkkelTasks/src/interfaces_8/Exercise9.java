/**
 * 
 */
package interfaces_8;


/**
 * @author ¡Ó„‰‡Ì
 *
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Music3.main(args);

    }

}

abstract class Instrument {
    abstract void play(Note n);

    abstract String what();
    abstract void adjust();
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
    // Doesnít care about type, so new types
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
	    tune(i);
	};
    }
}
