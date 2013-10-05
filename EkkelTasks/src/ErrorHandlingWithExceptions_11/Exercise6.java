/**
 * Exercise 6:   (1) Create two exception classes, each of which performs its own logging
 * automatically. Demonstrate that these work.  
 */
package ErrorHandlingWithExceptions_11;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    throw new LoggingException_1();
	} catch (LoggingException_1 e) {
	    System.err.println(">>>>Catched " + e);
	}
	try {
	    throw new LoggingException_2();
	} catch (LoggingException_2 e) {
	    System.err.println(">>>>Catched " + e);
	}

    }

}

class LoggingException_1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException_1");

    public LoggingException_1() {
	StringWriter trace = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
    }
}

class LoggingException_2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException_2");

    public LoggingException_2() {
	StringWriter trace = new StringWriter();
	printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
    }
}
