package eckel.errorhandling;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*
 * ex 6
 */

class A extends Exception {
    private static Logger logger = Logger.getLogger("AException");

    public A() {
	StringWriter stringWriter = new StringWriter();
	printStackTrace(new PrintWriter(stringWriter));
	logger.severe(stringWriter.toString());
    }
}

class B extends Exception {
    private static Logger logger = Logger.getLogger("BException");

    public B() {
	StringWriter stringWriter = new StringWriter();
	printStackTrace(new PrintWriter(stringWriter));
	logger.severe(stringWriter.toString());
    }
}

public class Six {
    public static void a() throws A {
	throw new A();
    }

    public static void b() throws B {
	throw new B();
    }

    public static void main(String[] args) {
	try {
	    a();
	} catch (A a) {
	    a.printStackTrace();
	}
	try {
	    b();
	} catch (B b) {
	    b.printStackTrace();
	}
    }

}
