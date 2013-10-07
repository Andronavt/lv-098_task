/**
 * Exercise 4: (3) Create an abstract class with no methods. Derive a class and 
 * add a method. Create a static method that takes a reference to the base class,
 * downcasts it to the derived class, and calls the method. In main( ), 
 * demonstrate that it works. Now put the abstract declaration for the method in 
 * the base class, thus eliminating the need for the downcast.
 */
package com.sofserveinc.edu.lms.interfaces;


abstract class Human {
    
}

class Man extends Human{
    public void name() {
	System.out.println("Man.name()");
    }
}

/**
 * @author Maryan
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Man man = new Man();
	Exercise4.say(man);
    }
    
    public static void say(Human h){
	((Man)h).name();
    }
}
