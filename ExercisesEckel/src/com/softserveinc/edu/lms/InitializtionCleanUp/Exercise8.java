/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise8 ex = new Exercise8();
	ex.method();
    }

    public void method() {
	method1();
	this.method1();

    }

    public void method1() {
	System.out.println("method1");
    }
}
