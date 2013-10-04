/**
 * 
 */
package com.softserveinc.edu.lms.opearator;

/**
 * @author Maryan
 *
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog1 dog1 = new Dog1("spot", "Ruff!");
	Dog1 dog2 = new Dog1("scuffy", "Wruf!");
	Dog1 dog3 = new Dog1("Jack", "Bark");
	
	System.out.println(dog1.toString());
	System.out.println(dog2.toString());
    }

}

class Dog1 {
    
    private String name;
    private String says;
    
    public Dog1 () {
	
    }
    
    public Dog1 (String name, String says) {
	this.name = name;
	this.says = says;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSays() {
        return says;
    }
    
    public void setSays(String says) {
        this.says = says;
    }
    
    @Override
    public String toString () {
	return "Dog " + getName() + ", says " + getSays(); 
    }
    
}