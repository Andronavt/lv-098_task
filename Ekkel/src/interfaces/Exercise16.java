package interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author orecto
 */
/*
 * Create a class that produces a sequence of chars. Adapt this class so that it
 * can be an input to a Scanner object
 */

class CharRnd {
	Random rand = new Random();

	public char gener() {
		return (char) rand.nextInt(128);
	}
}

class AdaptedCharRnd extends CharRnd implements Readable {
	private int count;

	public AdaptedCharRnd(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		String result = Character.toString(gener()) + " ";
		cb.append(result);
		return result.length();
	}
}

public class Exercise16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedCharRnd(10));
		while (s.hasNext())
			System.out.print(s.next() + " ");
		s.close();
	}
}
