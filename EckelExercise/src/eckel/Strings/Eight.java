package eckel.strings;

import java.util.Arrays;

/*
 * ex 8
 * Split the string Splitting.knights on the words "the" or "you"
 */

public class Eight {
    public static void main(String[] args) {
	String knights = "Then, when you have found the shrubbery, you must "
		+ "cut down the mightiest tree in the forest... "
		+ "with... a herring!";
	System.out.println(Arrays.toString(knights.split("then|you")));
    }

}
