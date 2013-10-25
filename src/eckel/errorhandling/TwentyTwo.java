package eckel.errorhandling;

/*
 * ex 22
 * create a class called FailingConstructor with a constructor that might fail 
 * partway through the construction process and throw an exception.In main(), write code that properly guards against this failure.
 * ex 23
 * add a class with a dispose() method to the previous exercise.Modify FailingConstructor so that the constructor creates one of these disposable objects
 * as a member object, after which the constructor might throw an exception, after which it creates a second disposable member object.Write a code to properly guard 
 * against failure and in main() verify that all possible failure situations are covered.
 */

class What {
    void dispose() {
	System.out.println("dispose()");
    }
}

class FailingConstructor {
    private String s;
    private int[] arr;
    private static What w1;
    private static What w2;

    // ex 22
    // public FailingConstructor(String s) throws Exception {
    // arr = new int[2];
    // arr[0] = 1;
    // arr[1] = 2;
    // arr[2] = 3;
    // arr[3] = 4;
    // this.s = s;
    // }
    // ex 23
    public FailingConstructor() throws Exception {
	try {
	    w1 = new What();
	    try {
		arr[2] = 2;
		try {
		    w2 = new What();
		} catch (Exception e) {
		    System.out.println("3x innner try");
		    e.printStackTrace();
		    System.out.println("fail to create w2");
		}
	    } catch (Exception e) {
		System.out.println("2x inner try");
		e.printStackTrace();
		System.out.println("dispose w1");
		w1.dispose();
	    }
	} catch (Exception e) {
	    System.out.println("last try :)");
	    e.printStackTrace();
	    System.out.println("fail to create w1");
	}
    }

}

public class TwentyTwo {
    public static void main(String[] args) {
	// ex 22
	// try {
	// FailingConstructor f = new FailingConstructor("foo");
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	//
	// }
	// ex 23
	try {
	    FailingConstructor f = new FailingConstructor();
	} catch (Exception e) {
	    System.out.println("in main()");
	    e.printStackTrace();
	}
    }
}
