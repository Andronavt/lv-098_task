package eckel.errorhandling;

/*
 * ex 20
 * Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this exception.Test the modified hierarchy.
 */
class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {
}

class FromGame extends UmpireArgument {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
	// Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul, UmpireArgument;

    public void umpireMethod() throws UmpireArgument {
    }

    public void walk() {
    } // Throws no checked exceptions
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
    public StormyInning() throws UmpireArgument, RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    // Regular methods must comform to base class:
    // ! void walk() throws PopFoul {} // Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    // ! public void event() throws RainedOut {}
    // If method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {
    }

    // You can choose to not throw any exceptions,
    // even if the base class version does:
    public void event() {
    }

    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul, FromGame {
	throw new FromGame();
    }

    public void umpireMethod() throws UmpireArgument {
	throw new UmpireArgument();
    }
}

public class Twenty {
    public static void main(String[] args) {
	try {
	    StormyInning si = new StormyInning();
	    si.atBat();
	    si.umpireMethod();
	} catch (PopFoul e) {
	    System.out.println("Pop foul");
	} catch (UmpireArgument e) {
	    System.out.println("Umpire argument (StormyInning)");
	    // } catch(ThrownFromGame e) {
	    // System.out.println("Thrown from game");
	} catch (RainedOut e) {
	    System.out.println("Rained out");
	} catch (BaseballException e) {
	    System.out.println("Generic baseball exception");
	}
	// Strike not thrown in derived version.
	try {
	    // What happens if you upcast?
	    Inning i = new StormyInning();
	    i.atBat();
	    // You must catch the exceptions from
	    // the base-class version of the method:
	} catch (Strike e) {
	    System.out.println("Strike");
	} catch (Foul e) {
	    System.out.println("Foul");
	} catch (FromGame e) {
	    System.out.println("Thrown from game (Inning)");
	} catch (RainedOut e) {
	    System.out.println("Rained out");
	} catch (BaseballException e) {
	    System.out.println("Generic baseball exception");
	}
    }

}
