/**
 * 
 */
package polymorphism;

import java.util.Random;

/**
 * @author orecto
 * 
 */
public class Exercise8 {
	private static RandomMusicGenerator gen = new RandomMusicGenerator();

	public static void main(String[] args) {
		Instrument[] s = new Instrument[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next(5);
		// Make polymorphic method calls:
		Exercise6.tuneAll(s);
		for (Instrument shp : s){
			System.out.println(shp);
		}
		
	}
}

class RandomMusicGenerator {
	private Random rand = new Random();

	public Instrument next(int i) {
		switch (rand.nextInt(i)) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Woodwind();
		case 4:
			return new Drum();
		}
	}
}

/*
 * Modify Music3.java so that it randomly creates Instrument objects the way
 * Shapes.java does
 */
