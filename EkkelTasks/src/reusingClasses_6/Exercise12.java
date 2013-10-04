/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Stem3 obj = new Stem3();
	try {

	} finally {
	    obj.dispose();
	}

    }

}

class Root3 {
    Root3() {
	System.out.println("Create Root3");
    }

    Component111 obj1 = new Component111();
    Component222 obj2 = new Component222();
    Component333 obj3 = new Component333();

    public void dispose() {
	System.out.println("Dispose Root3");
	obj3.dispose();
	obj2.dispose();
	obj1.dispose();
    }
}

class Stem3 extends Root3 {
    Stem3() {
	System.out.println("Create Stem3");
    }

    public void dispose() {
	System.out.println("Dispose Stem3");
	super.dispose();
    }
}

class Component111 {
    Component111() {
	System.out.println("Create Component111");
    }

    public void dispose() {
	System.out.println("Dispose Component111 ");
    }

}

class Component222 {
    Component222() {
	System.out.println("Create Component222");
    }

    public void dispose() {
	System.out.println("Dispose Component222");
    }
}

class Component333 {
    Component333() {
	System.out.println("Create Component333");
    }

    public void dispose() {
	System.out.println("Dispose Component333");
    }
}
