/**
 * Exercise 7:   (1) Modify Exercise 3 so that the catch clause logs the results.  
 */
package ErrorHandlingWithExceptions_11;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author Богдан
 *
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    int[] array = new int[2];
	    array[3] = 1;
	} catch (ArrayIndexOutOfBoundsException e) {
	    logException(e);
	}

    }
    private static Logger logger = Logger.getLogger("Exercise7Exception");
    static void logException(Exception e){
	StringWriter trace = new StringWriter();
	e.printStackTrace(new PrintWriter(trace));
	logger.severe(trace.toString());
    }

}

