/**
 * 
 */
package com.softserveinc.edu.lms.opearator;

/**
 * @author Maryan
 *
 */
public class Exercise14 {
    	
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	String str1 = "a";
	String str2 = "b";
	equalStrings(str1, str2);
	equalStrings(str1, str1);
	
    }
    
    public static void equalStrings (String string1, String string2) {
	System.out.println("string1 == string2" + string1 == string2);
	System.out.println("string1 != string2" + string1 != string2);
	System.out.println(" equals() : " + (string1.equals(string2)));
    }

}
