/**
 * 
 */
package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Andrew
 * 
 */
class CharRandom implements Readable {
    int count;
    private static Random rand = new Random();
    
    CharRandom(int count) {
	this.count = count;
    }

    @Override
    public int read(CharBuffer arg0) throws IOException {

	if (count-- == 0)
	    return -1;
	String result = Character.toString(next()) + " ";
	arg0.append(result);
	return result.length();
    }

    

    public char next() {
	return (char) rand.nextInt(128);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(new CharRandom(10));
	while (sc.hasNext()) {
	    System.out.println(sc.next());
	}
	sc.close();
    }
}

public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	CharRandom.main(args);

    }

}
