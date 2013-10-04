/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */
class Component12 {
    public Component12(String str) {
	System.out.println(str + "Component12 constructor");
    }
}

class Component22 {
    public Component22(String str) {
	System.out.println(str + "Component22 constructor");
    }

}

class Component32 {
    public Component32(String str) {
	System.out.println(str + "Component32 constructor");
    }
}

class Root1 {

    public Root1(String str) {
	new Component12("Comp12 = ");
	new Component22("Comp22 = ");
	new Component32("Comp32 = ");
	System.out.println(str + "Root1 constructor");
    }

}

class Steam1 extends Root1 {
    public Steam1(String str) {
	super("Root1 = ");
	System.out.println( str + "Steam1 constructor");
    }

}

public class Exercise10 {
    public static void main(String[] args) {
	Steam1 st1 = new Steam1("Steam1 = ");
    }
}