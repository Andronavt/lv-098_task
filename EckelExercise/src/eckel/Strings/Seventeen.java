package eckel.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eckel.util.TextFile;

/*
 * ex 17
 * write a program that reads a Java source-code file (you provide the file name on the command line)
 * and displays all the comments.
 */
public class Seventeen {
    public static void main(String[] args) throws Exception {
	if (args.length < 1) {
	    System.out.println("Usage: fileName");
	    System.exit(0);
	}
	Pattern p = Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");
	// Iterate through the lines of the input file:
	int index = 0;
	Matcher m = p.matcher(""); // creates emtpy Matcher object
	System.out.println(args[0] + " comments: ");
	for (String line : new TextFile(args[0])) {
	    m.reset(line);
	    while (m.find())
		System.out.println(index++ + ": " + m.group());
	}
    }
}
