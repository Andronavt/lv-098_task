/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan 
 * class Exercise7 використовується замість класу С
 */
public class Exercise7 extends B1 {

    public Exercise7 (String str) {
	super(str);
	System.out.println("Exercise7 consturctor");
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	new Exercise7("aaa");
    }

}




class A1 {
    public A1(String str) {
	System.out.println("A1 constructor");
    }
}

class B1 extends A1 {
    public B1(String str) {
	super(str);
	System.out.println("B1 constructor");
    }
}