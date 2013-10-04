/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog1 dog = new Dog1();
	dog.bark(1, "bark");
	dog.bark("wruff, wruff", 2);
    }

}

class Dog1 {

    public void bark(int id, String str) {
	System.out.println("id = " + id + " say " + str);
    }

    public void bark(String str, int id) {
	System.out.println("say " + str + " id = " + id);

    }
}
