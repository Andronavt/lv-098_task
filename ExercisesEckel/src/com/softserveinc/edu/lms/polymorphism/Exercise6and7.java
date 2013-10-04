/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

import java.util.Arrays;

/**
 * @author Maryan
 * 
 */

enum Note {
MIDDLE_C, C_SHARP, B_FLAT; 
}

class Instrument {

    void play(Note n) {
	System.out.println("Instrument.play() " + n);
    }
    
    @Override
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

    @Override
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

    @Override
    public String toString() {
	return "Percussion";
    }

    void adjust() {
	System.out.println("Adjusting Percussion");
    }
}

/*Exercise7
 * */

class Drum extends Instrument {
    
    
    void play(Note n) {
	System.out.println("Drum.play() " + n);
    }

    
    void adjust() {
	System.out.println("Adjusting Drum");
    }
    
    @Override
    public String toString () {
	return "Drum";
    }
    
}

class Stringed extends Instrument {

    void play(Note n) {
	System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
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

    @Override
    public String toString() {
	return "Woodwind";
    }
}

class Music3 {

        public static void tune(Instrument i) {
	i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
	for (Instrument i : e)
	    tune(i);
    }
    
    public static void main(String[] args) {
	
	/*
	 *Exercise7 new Drum
	 */
	
	Instrument[] orchestra = { new Wind(), new Percussion(),
		new Stringed(), new Brass(), new Woodwind(), new Drum()
	};
	
	tuneAll(orchestra);
	
	System.out.println(Arrays.toString(orchestra));
    }
}

public class Exercise6and7 extends Music3{
    
}
