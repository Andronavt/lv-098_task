/**
 * 
 */
package interfaces_8;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Богдан
 * 
 */
public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Scanner s = new Scanner(new AdapterTest16(10)); 
	    while(s.hasNext()) 
	      System.out.println(s.next()); 
	  }

}

class Test16 {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	    .toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz"
	    .toCharArray();

    public char next() {
	if (rand.nextBoolean()) {
	    return capitals[rand.nextInt(capitals.length)];
	} else {
	    return lowers[rand.nextInt(lowers.length)];
	}

    }

}

class AdapterTest16 extends Test16 implements Readable {
    int count;

    public AdapterTest16(int count) {
	this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
	if (count-- == 0)
	    return -1;
	cb.append(next());
	return count;
    }
}
