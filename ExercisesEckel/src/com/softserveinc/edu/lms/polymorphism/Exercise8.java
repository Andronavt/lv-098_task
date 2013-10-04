/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

import java.util.Arrays;
import java.util.Random;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author Maryan
 * 
 */

enum Note1 {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument1 {

    void play(Note1 n) {
	System.out.println("Instrument1.play() " + n);
    }

    @Override
    public String toString() {
	return "Instrument";
    }

    void adjust() {
	System.out.println("Adjusting Instrument");
    }

}

class Wind1 extends Instrument1 {

    void play(Note1 n) {
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

class Percussion1 extends Instrument1 {

    void play(Note1 n) {
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

/*
 * Exercise7
 */

class Drum1 extends Instrument1 {

    void play(Note1 n) {
	System.out.println("Drum.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Drum");
    }

    @Override
    public String toString() {
	return "Drum";
    }

}

class Stringed1 extends Instrument1 {

    void play(Note1 n) {
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

class Brass1 extends Wind1 {

    void play(Note1 n) {
	System.out.println("Brass.play() " + n);
    }

    void adjust() {
	System.out.println("Adjusting Brass");
    }
}

class Woodwind1 extends Wind1 {

    void play(Note1 n) {
	System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
	return "Woodwind";
    }
}

class RandomInstrGenerator {

    private Random rand = new Random();

    public Instrument1 next() {
	
	switch (rand.nextInt(5)) {
	default:
	case 0:
	    return new Wind1();
	case 1:
	    return new Instrument1();
	case 2:
	    return new Brass1();
	case 3:
	    return new Percussion1();
	case 4:
	    return new Stringed1();

	}
    }

}

class Music31 {

    public static void tune(Instrument1 i) {
	i.play(Note1.MIDDLE_C);
    }

    public static void tuneAll(Instrument1[] e) {
	for (Instrument1 i : e)
	    tune(i);
    }

    private static RandomInstrGenerator rni = new RandomInstrGenerator();
    
    public static void main(String[] args) {
	
	Instrument1[] orchestra = new Instrument1[10];

	for (int i=0; i<orchestra.length; i++) {
	    orchestra[i] = rni.next();    
	}
		
	System.out.println(Arrays.toString(orchestra));
    }
}

public class Exercise8 extends Music3 {

}
