//: object/Tree.java 
package eckel.everythingisanobject;

/**
 * Tree info
 * 
 * @author andrew
 * @version 1.0
 */
public class Tree {
    /*
     * value of tree height
     */
    int height;

    /*
     * default constructor
     */
    Tree() {
	System.out.println("Planting a seedling");
    }

    /**
     * @param initialHeight
     *            initialization height of tree
     */
    Tree(int initialHeight) {
	height = initialHeight;
	System.out
		.println("Creating new Tree that is " + height + " feet tall");
    }

    /*
     * show info tree
     */

    void info() {
	System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * show info tree
     * 
     * @param s
     *            some string
     * 
     */
    void info(String s) {
	System.out.println(s + ": Tree is " + height + " feet taill");
    }
}
// /:~