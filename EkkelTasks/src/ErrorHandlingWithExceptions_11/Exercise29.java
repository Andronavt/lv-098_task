/**
 * Exercise 29:   (1) Modify all the exception types in Stormylnning.java so that they 
 * extend RuntimeException, and show that no exception specifications or try blocks are 
 * necessary. Remove the ë//!í comments and show how the methods can be compiled without 
 * specifications. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise29 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	StormyInning2.main(args);
    }

}

class BaseballException2 extends RuntimeException {
}

class Foul2 extends BaseballException2 {
}

class Strike2 extends BaseballException2 {
}

abstract class Inning2 {
    public Inning2() throws BaseballException2 {
    }

    public void event() throws BaseballException2 {
	// Doesnít actually have to throw anything
    }

    public abstract void atBat() throws Strike2, Foul2;

    public void walk() {
    } // Throws no checked exceptions
}

class StormException2 extends RuntimeException {
}

class RainedOut2 extends StormException2 {
}

class PopFoul2 extends Foul2 {
}

interface Storm2 {
    public void event() throws RainedOut2;

    public void rainHard() throws RainedOut2;
}

class StormyInning2 extends Inning2 implements Storm2 {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning2() throws RainedOut2, BaseballException2 {
    }

    public StormyInning2(String s) throws Foul2, BaseballException2 {
    }

    // Regular methods must conform to base class:
    public void walk() throws PopFoul2 {
    } // Compile error

    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    public void event() throws RainedOut2 {
    }

    // If the method doesnít already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut2 {
    }

    // You can choose to not throw any exceptions,
    // even if the base version does:
    // public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul2 {
    }

    public static void main(String[] args) {
	try {
	    StormyInning2 si = new StormyInning2();
	    si.atBat();
	} catch (PopFoul2 e) {
	    System.out.println("Pop foul");
	} catch (RainedOut2 e) {
	    System.out.println("Rained out");
	} catch (BaseballException2 e) {
	    System.out.println("Generic baseball exception");
	}
	// Strike not thrown in derived version.
	try {
	    // What happens if you upcast?
	    Inning2 i = new StormyInning2();
	    i.atBat();
	    // You must catch the exceptions from the
	    // base-class version of the method:
	} catch (Strike2 e) {
	    System.out.println("Strike");
	} catch (Foul2 e) {
	    System.out.println("Foul");
	} catch (RainedOut2 e) {
	    System.out.println("Rained out");
	} catch (BaseballException2 e) {
	    System.out.println("Generic baseball exception");
	}
    }
}
