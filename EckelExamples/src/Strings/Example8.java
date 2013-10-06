/**
 * 
 */
package Strings;

import java.util.Arrays;

/**
 * @author Oleg
 * 
 */
public class Example8 {

	public static String knights = "Then, when you have found the shrubbery, you must "
			+ "cut down the mightiest tree in the forest... "
			+ "with... a herring!";
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}

	public static void main(String[] args) {
		split("the|you");
	}

}
