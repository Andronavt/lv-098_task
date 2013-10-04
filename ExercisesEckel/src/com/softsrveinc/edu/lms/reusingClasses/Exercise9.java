/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */
class Component1 {
    public Component1() {
	System.out.println("Component1 constructor");
    }
}

class Component2 {
    public Component2() {
	System.out.println("Component2 constructor");
    }

}

class Component3 {

    public Component3() {
	System.out.println("Component3 constructor");
    }
}

class Root {

    public Root() {
	new Component1();
	new Component2();
	new Component3();
	System.out.println("Root constructor");
    }

}

class Steam extends Root {
    public Steam() {
	super();
	System.out.println("Steam constructor");
    }

}

public class Exercise9 {
    public static void main(String[] args) {
	Steam st = new Steam();
    }
}