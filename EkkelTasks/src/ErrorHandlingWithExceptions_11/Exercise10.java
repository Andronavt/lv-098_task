/**
 * Exercise 10:   (2) Create a class with two methods, f( ) and g( ). In g( ), throw an
 * exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch
 * clause, throw a different exception (of a second type that you define). Test your code in 
 * main( ).  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    g();

	} catch (Exercise9Ex_2 e) {
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
	    throw new Exercise9Ex_2(">>>>Exception 2<<<<");
	}
    }

}
