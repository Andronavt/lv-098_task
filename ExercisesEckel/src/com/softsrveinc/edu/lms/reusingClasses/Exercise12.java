/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 *
 */

class Component13 {
    public Component13() {
	System.out.println("Component13 constructor");
    }
    
    public static void dispose() {
	System.out.println("Component13.dispose()");
    }
}

class Component23 {
    public Component23() {
	System.out.println("Component23 constructor");
    }
    
    public static void dispose() {
	System.out.println("Component23.dispose()");
    }

}

class Component33 {

    public Component33() {
	System.out.println("Component33 constructor");
    }
    
    public static void dispose() {
	System.out.println("Component33.dispose()");
    }
}

class Root2 {

    public Root2() {
	new Component13().dispose();
	new Component23().dispose();
	new Component33().dispose();
	System.out.println("Root2 constructor");
    }

    public static void dispose() {
	System.out.println("Root2.dispose()");
    }
}

class Steam2 extends Root2 {
    public Steam2() {
	super();
	System.out.println("Steam2 constructor");
    }
    
    
    public static void dispose() {
	System.out.println("Steam2.dispose()");
    }

}



public class Exercise12 extends Steam2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Steam2 st = new Steam2();
	Steam2.dispose();
    }

}
