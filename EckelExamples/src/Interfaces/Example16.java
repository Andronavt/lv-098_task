/**
 * 
 */
package Interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Oleg
 * 
 */
class CharSequence {
	private static Random rand = new Random();
	public char next() {
		return (char) rand.nextInt(128);
	}
}

public class Example16 extends CharSequence implements Readable {
	private int count;
	public Example16(int count) {
		this.count = count;
	}
	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new Example16(10));
		while (s.hasNext())
			System.out.println(s.next() + " ");
	}

}
