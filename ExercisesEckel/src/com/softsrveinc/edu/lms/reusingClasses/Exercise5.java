/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan class Exercise5 використовується замість класу С
 */
public class Exercise5 extends A {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Exercise5();
    }

}




class A {
    public A() {
	System.out.println("A constructor");
    }
}

class B extends A {
    public B() {
	System.out.println("B constructor");
    }
}