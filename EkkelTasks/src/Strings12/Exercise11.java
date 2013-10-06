/**
 * Exercise 11:   (2) Apply the regular expression 
 * (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
 * to
 * "Arline ate eight apples and one orange while Anita hadnít any"
 */
package Strings12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String s = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\b";
	String str = "Arline ate eight apples and one orange while Anita hadnít any";
	Pattern p = Pattern.compile(s);
	Matcher m = p.matcher(str);
	while (m.find()) {
	    System.out.println("Match \"" + m.group() + "\" at positions "
		    + m.start() + "-" + (m.end() - 1));
	}
    }
}
