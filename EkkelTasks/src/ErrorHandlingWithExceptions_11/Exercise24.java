/**
 * 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise24 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    Test24_1 obj = new Test24_1(0);// if 0 change to 1, then be call
					   // Exception
	    try {
		obj.s = "text";
	    } catch (Exception e) {
		System.out.println("Catch Exception");
	    } finally {
		obj.dispose();
	    }
	} catch (Exception e) {
	    System.out
		    .println("object Test24_1 not created, because catched Exception: "
			    + e);
	}

    }

}

class Test24_1 {
    String s;
    private int[] array = new int[1];

    Test24_1(int i) throws Exception {
	array[i] = 1;
	System.out.println("object Test24_1 created");
    }

    public void dispose() {
	System.out.println("object Test24_1 disposed");
    }

}
