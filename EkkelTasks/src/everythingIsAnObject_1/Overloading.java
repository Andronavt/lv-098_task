/**
 * 
 */
package everythingIsAnObject_1;

/**
 * Demonstration of both constructor and ordinary method overloading.
 * 
 * @author Богдан
 * 
 */

class Tree {
    int height;

    /**
     * Constractor of class Tree.
     * 
     * @param no
     *            param
     * 
     */
    Tree() {
	System.out.println("Planting a seedling");
	height = 0;
    }
    /**
     * Constractor of class Tree.
     * 
     * @param initialHeight
     *            int number
     * 
     */
    Tree(int initialHeight) {
	height = initialHeight;
	System.out
		.println("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * Method return "Tree is height feet tall" into System.out
     * 
     * @param no
     *            param
     * 
     */
    void info() {
	System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * Method return string + ": Tree is height feet tall" into System.out
     * 
     * @param String
     *            s
     * 
     */
    void info(String s) {
	System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    /**
     * Entry point to class & application.
     * 
     * @param args
     *            array of string arguments
     * @throws exceptions
     *             No exceptions thrown
     */
    public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	    Tree t = new Tree(i);
	    t.info();
	    t.info("overloaded method");
	}
	// Overloaded constructor:
	new Tree();
    }
}
