/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */

class Amphibian {

    public void say() {
	System.out.println("Amphibian: what’s up!");
    }
}

class Frog extends Amphibian {

    
}

public class Exercise16 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Frog frog = new Frog();
	frog.say();
    }

}
