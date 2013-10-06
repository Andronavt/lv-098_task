/**
 * Exercise 14:   (1) Rewrite SplitDemo using String.split( ).  
 */
package Strings12;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author Богдан
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	SplitDemo.main(args);

    }

}

class SplitDemo {
    public static void main(String[] args) {
	String input = "This!!unusual use!!of exclamation!!points";
	System.out.println(Arrays.toString(input.split("!!")));
	System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}