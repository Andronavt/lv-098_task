package eckel.everythingisanobject;

/*
 * Write a program that prints three arguments taken from the command line.To do this, you'll
 * need to index into the command-line array of strings.
 */
public class Tenth {
    public static void main(String[] args) {
	String s1 = args[0];
	String s2 = args[1];
	String s3 = args[2];
	for (int i = 0; i < args.length; i++) {
	    System.out.println(args[i]);
	}
    }

}
