package eckel.errorhandling;

/*/
 * ex 5
 */
public class FIve {
    private static final int SIZE = 5;
    private static int[] arr = new int[SIZE];
    private static int MAGIC_NUMBER = 10;

    public static void main(String[] args) {
	System.out.println("Start!");
	while (true) {
	    try {
		arr[MAGIC_NUMBER] = 1;
	    } catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		MAGIC_NUMBER--;
	    }
	}
    }
}
