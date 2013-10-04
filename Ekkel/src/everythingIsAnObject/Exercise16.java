/**
 * 
 */
package everythingIsAnObject;

//: initialization/Overloading.java 
//Demonstration of both constructor 
//and ordinary method overloading. 
//import static net.mindview.util.Print.*;
import static staticPack.StaticPrint.print;

/** Solving of exercise 16 */
public class Exercise16 {
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

class Tree {
    /** height of tree */
    int height;

    Tree() {
	print("Planting a seedling");
	height = 0;
    }

    Tree(int initialHeight) {
	height = initialHeight;
	print("Creating new Tree that is " + height + " feet tall");

    }

    void info() {
	print("Tree is " + height + " feet tall");
    }

    void info(String s) {
	print(s + ": Tree is " + height + " feet tall");
    }
}

// /:~ 