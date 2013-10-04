/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Stem2(0);

    }

}

class Root2 {
    Root2(int i) {
	System.out.println("Create Root");
    }

    Component11 obj1 = new Component11(1);
    Component22 obj2 = new Component22(2);
    Component33 obj3 = new Component33(3);
}

class Stem2 extends Root2 {
    Stem2(int i) {
	super(i);
	System.out.println("Create Stem");
    }
}

class Component11 {
    Component11(int i) {
	System.out.println("Create Component1");
    }

}

class Component22 {
    Component22(int i) {
	System.out.println("Create Component2");
    }
}

class Component33 {
    Component33(int i) {
	System.out.println("Create Component3");
    }
}