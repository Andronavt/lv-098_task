/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

/**
 * @author Maryan
 *
 */


class Human {
    private String name;
    
    public void sayName () {
	String name = getName("Jack");
	
	System.out.println("My name is " + name);
    }
    
    public String getName (String name) {
	return this.name = name;
    }
}


class Man extends Human{
    
    private String name;
    @Override
    public String getName (String name) {
	return this.name = name;
    }
}

public class Exercise10 {

    private static Man man = new Man();
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Human human = man;
	human.sayName();
    
    }

}
