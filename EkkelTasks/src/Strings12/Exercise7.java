/**
 * Exercise 7:   (5) Using the documentation for java.util.regex.Pattern as a resource, 
 * write and test a regular expression that checks a sentence to see that it begins with a capital 
 * letter and ends with a period.  
 */
package Strings12;
import java.util.regex.Pattern;
/**
 * @author Богдан
 *
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String s = "It is my sentence.";
	 System.out.println(s.matches("^[A-Z].*[\\.]$"));

    }

}

