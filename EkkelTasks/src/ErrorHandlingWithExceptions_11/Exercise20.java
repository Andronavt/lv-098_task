/**
 * Exercise 20:   (3) Modify StormyInning.java by adding an UmpireArgument
 * exception type and methods that throw this exception. Test the modified hierarchy.  
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	StormyInning.main(args);

    }

}

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {

}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
	// Doesnít actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exceptions

    public void umpire() throws UmpireArgument {
	throw new UmpireArgument();
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    // Regular methods must conform to base class:
    // ! void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    // ! public void event() throws RainedOut {}
    // If the method doesnít already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {
    }

    // You can choose to not throw any exceptions,
    // even if the base version does:
    public void event() {
    }

    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
	try {
	    StormyInning si = new StormyInning();
	    si.atBat();
	    si.umpire();
	} catch (PopFoul e) {
	    System.out.println("Pop foul");
	} catch (RainedOut e) {
	    System.out.println("Rained out");
	} catch (UmpireArgument e) {
	    System.out.println("UmpireArgument Exception");
	} catch (BaseballException e) {
	    System.out.println("Generic baseball exception");
	}
	// Strike not thrown in derived version.
	try {
	    // What happens if you upcast?
	    Inning i = new StormyInning();
	    i.atBat();
	    i.umpire();
	    // You must catch the exceptions from the
	    // base-class version of the method:
	} catch (Strike e) {
	    System.out.println("Strike");
	} catch (Foul e) {
	    System.out.println("Foul");
	} catch (RainedOut e) {
	    System.out.println("Rained out");
	} catch (UmpireArgument e) {
	    System.out.println("UmpireArgument Exception");
	} catch (BaseballException e) {
	    System.out.println("Generic baseball exception");
	}
    }
}
