/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

import java.util.Arrays;

/**
 * @author Maryan
 * 
 */
public class Exercise19 {
    private static String str1 = "one";
    private static String str2 = "two";
    private static String str3 = "three";

    
    private static String[] arr1 = new String[] {"aa", "bb", "cc"};
    /**
     * @param args
     */
    public static void main(String[] args) {

	varArgMethod(arr1);
	
    }

    public static void varArgMethod(String... strings) {
	System.out.println(Arrays.toString(strings));
    }

}
