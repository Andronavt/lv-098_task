/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
import polymorphism.music.Note;

import static staticPack.StaticPrint.print;

abstract class Instrument implements IPlayable {

	String what() {
		return "Instrument " + this.getClass().getName();
	}

	void adjust() {
		print("Adjusting Instrument");
	}

	public String toString() {
		return what();
	}
}

interface IPlayable {
	void play(Note n);
}

class Wind extends Instrument implements IPlayable {
	public void play(Note n) {
		print("Wind.play() " + n);
	}

	// String what() {
	// return "Wind";
	// }

	void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion extends Instrument implements IPlayable {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	// String what() {
	// return "Percussion";
	// }

	void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument implements IPlayable {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}

	// String what() {
	// return "Stringed";
	// }

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind implements IPlayable {
	public void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind extends Wind implements IPlayable {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}

	// String what() {
	// return "Woodwind";
	// }
}

class Drum extends Instrument implements IPlayable {
	public void play(Note n) {
		print("Drum.play() " + n);
	}

	String what() {
		return "Drum";
	}
}

public class Exercise9 {
	// ������ ������ �� ������� �� ������������ ���� �������,
	// ������� ����, ����������� � �������, ����� �������� ���������:
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
		for (Instrument i : orchestra) {
			System.out.println(i);
		}
	}
}
/*
 * Refactor Musics.java by moving the common methods in Wind, Percussion and
 * Stringed into an abstract class
 */