/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise2 {
    private static String str1 = "one";
    private static String str2 = "two";
    private static String str3;

    public Exercise2() {
	
    }
    
    public Exercise2(String str3) {
	this.str3 = str3;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("str1 " + str1 + " str2 " + str2 + " str3 " + str3);
	Exercise2 ex = new Exercise2("three");
	
	System.out.println("str1 " + str1 + " str2 " + str2 + " str3 " + ex);
    }
    
        public String toString () {
    	return str3;
        }
    
    
}
