/**
 * 
 */
package interfaces_8;

/**
 * @author ¡Ó„‰‡Ì
 *
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Music32.main(args);

    }

}
interface Playable{
    void play(Note n);
}

abstract class Instrument2{
    abstract String what();
    abstract void adjust();
}


class Wind2 extends Instrument2 implements Playable {
    public void play(Note n) {
	System.out.println("Wind.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Wind");
    }
}

class Percussion2 extends Instrument2 implements Playable {
    public void play(Note n) {
	System.out.println("Percussion.play() " + n);
    }

    String what() {
	return super.toString();
    }

    void adjust() {
	System.out.println("Adjusting Percussion");
    }
}

class Stringed2 extends Instrument2 implements Playable {
    public void play(Note n) {
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
    public void play(Note n) {
	System.out.println("Brass.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Brass");
    }
}

class Woodwind2 extends Wind2 {
    public void play(Note n) {
	System.out.println("Woodwind.play() " + n);
    }

    String what() {
	return super.toString();
    }
}

class Music32 {
    // Doesnít care about type, so new types
    // added to the system still work right:
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
	Playable[] orchestra = { new Wind2(), new Percussion2(),
		new Stringed2(), new Brass2(), new Woodwind2() };
	for(Playable i : orchestra){
	    tune(i);
	};
    }
}
