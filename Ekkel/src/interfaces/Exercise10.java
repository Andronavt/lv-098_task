/**
 * 
 */
package interfaces;

import polymorphism.music.Note;

/**
 * @author orecto
 * 
 */
public class Exercise10 {
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new Woodwind() };
		for (Instrument i : orchestra) {
			i.play(Note.MIDDLE_C);
		}
	}
}
/*
 * Modify Musics.java by adding a Playable interface. Move the play( )
 * declaration from Instrument to Playable. Add Playable to the derived classes
 * by including it in the implement s list. Change tune( ) so that it takes a
 * Playable instead of an Instrument
 */