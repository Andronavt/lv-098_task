/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Stem();
    }

}

class Root {
    Root() {
	System.out.println("Create Root");
    }

    Component1 obj1 = new Component1();
    Component2 obj2 = new Component2();
    Component3 obj3 = new Component3();
}

class Stem extends Root {
    Stem() {
	System.out.println("Create Stem");
    }
}

class Component1 {
    Component1() {
	System.out.println("Create Component1");
    }

}

class Component2 {
    Component2() {
	System.out.println("Create Component2");
    }
}

class Component3 {
    Component3() {
	System.out.println("Create Component3");
    }
}