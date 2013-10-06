/**
 * Exercise 10:   (2) For the phrase "Java now has regular expressions" evaluate whether the 
 * following expressions will find a match:  
 * ^Java 
 * \Breg.* 
 * n.w\s+h(a|i)s 
 * s? 
 * s* 
 * s+ 
 * s{4} 
 * S{1}. 
 * s{0,3} 
 */
package Strings12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Богдан
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String s = "Java now has regular expressions";
	String [] argum = "^Java \\Breg.* n.w\\s+h(a|i)s s? s* s+ s{4} S{1}. s{0,3}".split(" ");

	for (String arg : argum) {
	    System.out.println("Regular expression: \"" + arg + "\"");
	    Pattern p = Pattern.compile(arg);
	    Matcher m = p.matcher(s);
	    while (m.find()) {
		System.out.println("Match \"" + m.group() + "\" at positions "
			+ m.start() + "-" + (m.end() - 1));
	    }
	}
    }

}
