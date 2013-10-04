/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */

class Amphibian1 {

    public void say() {
	System.out.println("Amphibian: what’s up!");
    }
}

class Frog1 extends Amphibian1 {

    @Override
    public void say () {
	System.out.println("Frog: what’s up!");
    }
    
}

public class Exercise17 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Frog1 frog = new Frog1();
	frog.say();
    }

}
