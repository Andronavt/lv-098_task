/**
 * Exercise 12:   (5) Modify Groups.java to count all of the unique words that do not start 
 * with a capital letter.  
 */
package Strings12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Богдан
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Groups.main(args);

    }

}

class Groups {
    static public final String POEM = "Twas brillig, and the slithy toves\n"
	    + "Did gyre and gimble in the wabe.\n"
	    + "All mimsy were the borogoves,\n"
	    + "And the mome raths outgrabe.\n\n"
	    + "Beware the Jabberwock, my son,\n"
	    + "The jaws that bite, the claws that catch.\n"
	    + "Beware the Jubjub bird, and shun\n"
	    + "The frumious Bandersnatch.";

    public static void main(String[] args) {
	Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
	while (m.find()) {
	    System.out.println("[" + m.group() + "]");
	}
    }
}
