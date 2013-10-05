/**
 * Exercise 23:   (4) Add a class with a dispose( ) method to the previous exercise. Modify
 * FailingConstructor so that the constructor creates one of these disposable objects as a 
 * member object, after which the constructor might throw an exception, after which it creates a 
 * second disposable member object. Write code to properly guard against failure, and in 
 * main( ) verify that all possible failure situations are covered. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise23 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    new Test23_1(1);
	} catch (Exception e) {
	    System.out.println("Catch Exception");
	} finally {
	    System.out.println("Program works");
	}

    }

}

class Test23_1 {
    private int[] array = new int[1];

    Test23_1(int i) throws Exception {

	new Test23_2("Test22_2 obj #1").dispose();
	try {
	    array[i] = 1;
	} catch (Exception e) {
	    System.out.println(e);
	}
	new Test23_2("Test22_2 obj #2").dispose();
    }

}

class Test23_2 {
    private String s;

    Test23_2(String s) {
	this.s = s;
    }

    public void dispose() {
	System.out.println("Dispose with string " + s);
    }
}
