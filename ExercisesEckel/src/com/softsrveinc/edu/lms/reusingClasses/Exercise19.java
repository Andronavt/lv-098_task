/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 *
 */

class Person3 {
    private final String name= "Jack";
    
    public Person3 (String name) {
	name = "Anna";
	System.out.println(this.name);
    }

    public String getName() {
        return name;
    }
    
}

public class Exercise19 {
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Person3  p = new Person3("Jack");
	Person3 p1 =new Person3("Anna"); // Ім’я при виконанні прогрмаи не змінюється
    }

}
