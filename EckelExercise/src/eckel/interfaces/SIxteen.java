package eckel.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/*
 * Ex 16
 */

public class SIxteen implements Readable {
    private static Random rand = new Random();
    private int count;

    public SIxteen(int count) {
	this.count = count;
    }

    public char next() {
	return (char) rand.nextInt(128);
    }

    public static void main(String[] args) {
	Scanner s = new Scanner(new SIxteen(10));
	while (s.hasNext()) {
	    System.out.println(s.next());
	}
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
	//
	if (count-- == 0)
	    return -1;
	String result = Character.toString(next()) + " ";
	cb.append(result);
	return result.length();
    }
}
