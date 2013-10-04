/**
 * 
 */
package com.softserveinc.edu.lms.everythingIsAnObject;

/**
 * @author Maryan
 * 
 */
public class Exercise8 {
    /**
     * @param args
     */
    public static void main(String[] args) {
	StaticTest1 st1 = new StaticTest1();
	StaticTest1 st2 = new StaticTest1();
	StaticTest1 st3 = new StaticTest1();
	Incrementable1.increment();
	
	System.out.println("variable i in st1 = " + st1.i);
	System.out.println("variable i in st2 = " + st2.i);
	System.out.println("variable i in st3 = " + st3.i);
    }

}

class Incrementable1 {
    static void increment() {
	StaticTest1.i++;
    }
}

class StaticTest1 {
    static int i = 47;
}