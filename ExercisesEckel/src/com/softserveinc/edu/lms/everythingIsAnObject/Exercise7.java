/**
 * 
 */
package com.softserveinc.edu.lms.everythingIsAnObject;

/**
 * @author Maryan
 * 
 */
public class Exercise7 {
    /**
     * @param args
     */
    public static void main(String[] args) {
	Incrementable.increment();
    }

}

class Incrementable {
    static void increment() {
	StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}