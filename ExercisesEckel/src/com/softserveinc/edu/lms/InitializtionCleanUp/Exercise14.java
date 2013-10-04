/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 *
 */
public class Exercise14 {
    private static String str1;
    static {
	 str1 = "static block"; 
    }
    private static String str = "static String field";
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("static field = " + str);
	System.out.println("static block = " + Exercise14.str1);
    }

}
