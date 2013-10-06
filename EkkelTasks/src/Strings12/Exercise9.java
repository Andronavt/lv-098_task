/**
 * 
 */
package Strings12;

import java.util.Arrays;

/**
 * @author Богдан
 *
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Splitting2.main(args);

    }

}

class Splitting2 {
    public static String knights = "Then, when you have found the shrubbery, you must "
	    + "cut down the mightiest tree in the forest... "
	    + "with... a herring!";

    public static void split(String regex) {
	System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
	System.out.println(knights);
	split("[eyuioaEYUIOA]");
    }
}
