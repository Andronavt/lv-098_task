/**
 * Exercise 15:   (2) Show that WithFinally.java doesnít fail by throwing a
 * RuntimeException inside the try block.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	WithFinally.main(args);

    }

}

class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
	try {
	    sw.on();
	    throw new RuntimeException();
	    OnOffSwitch.f();
	} catch (OnOffException1 e) {
	    System.out.println("OnOffException1");
	} catch (OnOffException2 e) {
	    System.out.println("OnOffException2");
	} finally {
	    sw.off();
	}
    }
}
