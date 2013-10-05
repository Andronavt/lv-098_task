/**
 * Exercise 11:   (1) Repeat the previous exercise, but inside the catch clause, wrap g( )’s 
 * exception in a RuntimeException. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 *
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    g();

	} catch (RuntimeException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    public static void f() throws Exercise9Ex_1 {
	throw new Exercise9Ex_1(">>>>Exception 1<<<<");
    }

    public static void g() throws Exercise9Ex_2 {
	try {
	    f();
	} catch (Exercise9Ex_1 e) {
	    e.printStackTrace();
	    throw new RuntimeException(">>>>Exception 2<<<<");
	}
    }

}

