/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 *
 */

class Person {
    
    public void name() {
	System.out.println("Jack");
    }
    
    public void name (String name) {
	System.out.println(name);
    }
    
    public void name (int id, String name) {
	System.out.println("id = " + id + ", name - " + name);
    }
}

public class Exercise13 extends Person{

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise13  ex = new Exercise13();
	ex.name();
	ex.name("John");
	ex.name(1, "Vadim");
	ex.name("Johnie", 1);

    }
    
    public void name (String name, int id) {
	System.out.println("name - " + name + ", id = " + id);
    }

}
