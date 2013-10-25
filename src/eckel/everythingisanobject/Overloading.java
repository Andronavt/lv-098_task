//: object/Overloading.java
package eckel.everythingisanobject;

/**
 * illustration overloading
 * 
 * @author andrew
 * @version 1.0
 */
public class Overloading {
    /**
     * Entry point of class
     * 
     * @param args
     *            array of string arguments
     * @throws exceptions
     *             No exceptions thrown
     */
    public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	    Tree t = new Tree();
	    t.info();
	    t.info("overloaded meethod");
	}
	new Tree();
    }

}
// /:~