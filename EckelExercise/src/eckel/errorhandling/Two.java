package eckel.errorhandling;

/*
 * ex 2
 */

public class Two {
    private static Object o = null;

    public static void main(String[] args) {
	try {
	    System.out.println(Two.o.toString());
	} catch (NullPointerException e) {
	    e.getMessage();
	    e.printStackTrace();
	}

    }
}
