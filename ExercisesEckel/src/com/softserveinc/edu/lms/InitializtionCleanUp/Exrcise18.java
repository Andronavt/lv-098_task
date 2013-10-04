/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 *
 */
public class Exrcise18 {

    private static int  size =5;
    private static Exrcise18[] arr;
    
    public Exrcise18 (String str){
	System.out.println(str);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	 arr = new Exrcise18[size];
	 for (int i=0; i <=size-1; i++) {
	     arr[i] = new Exrcise18("Object Exrcise18 " + i);
	 }
    }

}
