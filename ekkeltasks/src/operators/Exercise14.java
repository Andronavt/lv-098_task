package operators;

/**
 * 
 * @author Andrew
 * 
 */
public class Exercise14 {
    /**
     * @param a
     * @param b
     */
    public static void compString(String a, String b) {
	System.out.println("First string  = " + a + "\n" + "Second string  = "
		+ b);
	System.out.println("Operations:");
	System.out.println("operation != is " + (a != b));
	System.out.println("operation == is " + (a == b));
	System.out.println("operation equal is " + a.equals(b));
	System.out.println();
    }

    public static void main(String[] args) {
	String a = "hello";
	String b = "Hi, man";
	String c = "hello";
	String d = "How are you?";
	compString(a, b);
	compString(a, c);
	compString(a, d);
	compString(c, b);
    }
}