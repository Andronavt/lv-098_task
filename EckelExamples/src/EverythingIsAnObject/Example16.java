/**
 * 
 */
package EverythingIsAnObject;

/**
 * Class Tree
 * 
 * @author Oleg
 * @version 1.1
 * 
 */
class Tree {

    /**
     * Field that will have a height of a tree
     */
    int height;

    /**
     * Tree constructor
     */
    Tree() {

	System.out.println("Planting a seedling");
	height = 0;
    }

    /**
     * Tree constructor with parametr
     * 
     * @param initialHeight
     */
    Tree(int initialHeight) {
	height = initialHeight;
	System.out.println("Creating tree that is " + height + " tall");

    }

    /**
     * Inro method
     */
    void info() {
	System.out.println("Tree is " + height + " meters tall");

    }

    /**
     * Info overloaded method
     * 
     * @param s
     */
    void info(String s) {
	System.out.println(s + ": Tree is " + height + " meters tall");
    }
}

/**
 * Class, thar realises clas Tree
 * 
 * @author Oleg
 * @version 1.2
 */
public class Example16 {
    public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	    Tree t = new Tree(i);
	    t.info();
	    t.info("Overload");
	}
	new Tree();

    }

}
