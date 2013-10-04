/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise4 {

    private String str;

    public Exercise4() {
	System.out.println("default constructor");
    }

    public Exercise4(String str) {
	this.str = str;
	System.out.println("Constructor with such " + str + " arguments.");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise4 ex = new Exercise4("STRING");
    }
}
