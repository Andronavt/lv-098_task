/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog dog = new Dog();
	dog.bark();
	dog.bark("wruff, wruff");
    }

}

class Dog {

    public void bark() {
	System.out.println("bark");
    }

    public void bark(String str) {
	str = "bark, bark!";
	System.out.println(str);
    }
}
