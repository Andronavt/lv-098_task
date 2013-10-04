package eckel.errorhandling;

/*
 * ex 15
 * show that WithFinally.java doesn't fail by throwing a RuntimeException inside the try block
 */
class WithFinally {

    static Integer[] x = new Integer[1];

    public static void f(int i) throws OnOffException1, OnOffException2 {
    }
}

public class Fifteen {
    private static Switch sw = new Switch();

    public static void main(String[] args) {
	try {
	    sw.on();
	    // Code to throw NullPointerException:
	    WithFinally.f(WithFinally.x[0]);
	} catch (OnOffException1 e) {
	    System.out.println("OnOffException1");
	} catch (OnOffException2 e) {
	    System.out.println("OnOffException2");
	} finally {
	    sw.off();
	}

    }

}
