package eckel.strings;

/*
 * using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that
 * it begins with a capital letter and ends with a period.
 */

public class Seven {
    public static void main(String[] args) {
	String rl = "^[A-Z].*[\\.]$";
	String s1 = "Adsflkm dfs .";
	String s2 = "sdfsdf sdf.";
	String s3 = "A .";
	System.out.println(s1.matches(rl));
	System.out.println(s2.matches(rl));
	System.out.println(s3.matches(rl));
    }

}
