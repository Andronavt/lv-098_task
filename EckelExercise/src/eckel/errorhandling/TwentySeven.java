package eckel.errorhandling;

/*
 * ex 27
 * modify exercise 3 to convert the exception to a RuntimeException.
 */
public class TwentySeven {
    private static int[] arr = new int[2];

    public static void main(String[] args) {
	try {
	    arr[2] = 010101010;
	} catch (ArrayIndexOutOfBoundsException e) {
	    throw new RuntimeException(e);
	}

    }
}
