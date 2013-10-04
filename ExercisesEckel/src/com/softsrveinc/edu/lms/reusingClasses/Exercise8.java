/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 *
 */
public class Exercise8  extends D{
    private String str;
    
    public Exercise8 () {
	super("Hello world!");
    }
    
    public Exercise8 (String str) {
	super(str);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise8 ex = new Exercise8();
	Exercise8 ex1 = new Exercise8("HELLO");
    }

}

class D {
    public D (String str) {
	System.out.println(str);
    }
}
