/**
 * Exercise 26:   (1) Change the file name string in MainException.java to name a file
 * that doesnít exist. Run the program and note the result.
 */
package ErrorHandlingWithExceptions_11;

import java.io.FileInputStream;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise26 {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
	// Open the file:
	FileInputStream file = new FileInputStream("NotExist.java");
	// Use the file ...
	// Close the file:
	file.close();
    }
}
