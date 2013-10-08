package eckel.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eckel.util.TextFile;

/*
 * ex 15
 * Modify JGrep.java to accept flags as arguments 
 * (e.g.,Pattern.CAE_INSENSITIVE, Pattern.MULTILINE).
 */
public class Fifteen {
    public static void main(String[] args) throws Exception {
	if (args.length < 2) {
	    System.out.println("Usage: java JGrep file regex");
	    System.exit(0);
	}

	int[] arr = { Pattern.CASE_INSENSITIVE, Pattern.CANON_EQ,
		Pattern.COMMENTS, Pattern.LITERAL, Pattern.MULTILINE,
		Pattern.UNICODE_CASE, Pattern.UNIX_LINES };
	String[] arrname = { "Pattern.CASE_INSENSITIVE", "Pattern.CANON_EQ",
		"Pattern.COMMENTS", "Pattern.LITERAL", "Pattern.MULTILINE",
		"Pattern.UNICODE_CASE", "Pattern.UNIX_LINES" };
	int f = 0;
	for (int i = 0; i < arrname.length; i++) {
	    if (args[2].equals(arrname[i])) {
		f = arr[i];
	    }
	}
	Pattern p = Pattern.compile(args[1], f);
	// Iterate through the lines of the input file:
	int index = 0;
	Matcher m = p.matcher("");
	for (String line : new TextFile(args[0])) {
	    m.reset(line);
	    while (m.find())
		System.out.println(index++ + ": " + m.group() + ": "
			+ m.start());
	}
    }
}
