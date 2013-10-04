/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */
public class Exercise3 extends Drawing {

    public Exercise3 () {
	System.out.println("Exercise3 constructor");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise3 ex = new Exercise3 ();
    }

}

class Art {
    
    public Art() {
	System.out.println("Art constructor");
    }
}

class Drawing extends Art {

    public Drawing() {
	System.out.println("Drawing constructor");
    }
}