package eckel.errorhandling;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*
 * ex 3 and 7
 */
public class Three {
    private static Logger logger = Logger.getLogger("Three Exception");

    static void logException(Exception e) { // Exception e argument
	StringWriter trace = new StringWriter();
	e.printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
    }

    public static void main(String[] args) {
	int[] arr = new int[5];
	try {
	    arr[6] = 2;
	} catch (ArrayIndexOutOfBoundsException e) {
	    e.getMessage();
	    e.printStackTrace();
	    logException(e);
	}
    }

}
