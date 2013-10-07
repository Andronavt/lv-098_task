/**
 * Exercise 3: (2) Create a base class with an abstract print( ) method that is overridden 
 * in a derived class. The overridden version of the method prints the value 
 * of an int variable defined in the derived class. 
 * At the point of definition of this variable, give it a nonzero value.
 * In the base-class constructor, call this method. In main( ),
 * create an object of the derived type, and then call its print( ) method.
 * Explain the results.
 */
package com.sofserveinc.edu.lms.interfaces;

/**
 * @author Maryan
 * 
 */

abstract class Print {
    public Print() {
	Exercise3 ex = new Exercise3();
	ex.print();
    }

    public abstract void print();
}

public class Exercise3 extends Print {
    private int i;

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise3 ex = new Exercise3();
	ex.print();
    }

    @Override
    public void print() {
	System.out.println(i = 5);
    }

}
