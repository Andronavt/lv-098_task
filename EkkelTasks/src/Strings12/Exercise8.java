/**
 * Exercise 8:   (2) Split the string Splitting.knights on the words "the" or ìyou."  
 */
package Strings12;

import java.util.Arrays;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Splitting.main(args);

    }

}

class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must "
	    + "cut down the mightiest tree in the forest... "
	    + "with... a herring!";

    public static void split(String regex) {
	System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
	System.out.println(knights);
	split("the");
	split("you");
    }
}
