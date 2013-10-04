/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */

class Person1 {

    protected void getName() {
	System.out.println("Jack");
    }
}

public class Exercise15 extends Person1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Person1 p = new Person1();
	p.getName();
    }

}
