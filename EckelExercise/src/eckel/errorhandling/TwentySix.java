package eckel.errorhandling;

import java.io.FileInputStream;

/*
 * ex 26
 * change the file name string in MainException.java to name a file that doesn't exist.RUn the program and note thre reuslt.
 */

class MainException26 {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
	// Leads to FileNotFoundException:
	FileInputStream file = new FileInputStream("vot_eto_povorot.jv");
	// Use the file ...
	// Close the file:
	file.close();
    }
}

public class TwentySix {
    public static void main(String[] args) {
	System.out.println("Hi");
    }

}
