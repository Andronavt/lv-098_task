/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */

class Person4 {

    public final void getName() {
	System.out.println("Jack");
    }
}

public class Exercise21 extends Person4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    /*
     * 
     * Переприсвоїти метод не можна оскільки він вляється final
     * @Override public void name() {
     * 
     * }
     */
}
