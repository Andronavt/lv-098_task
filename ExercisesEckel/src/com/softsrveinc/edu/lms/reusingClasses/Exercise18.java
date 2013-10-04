/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 *
 */
public class Exercise18 {
private final String NAME = "Jack";
private static final String SURNAME = "Daniels";
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise18 ex = new Exercise18();
	/*
	 * До поля NAME доступ надається тільки через екзкмпляр класу, 
	 * а до поля SURNAME ми здійснюємо доступ не створюючи екземпляр класу.
	 */
	
	System.out.println(ex.NAME);
	System.out.println(Exercise18.SURNAME);
    }

}
