/**
 * 
 */
package com.softserveinc.edu.lms.controlingExecution;

/**
 * @author Maryan
 *
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (int i=1; i<100; i++){
	   for (int j=i;j<=i;j++){
		if (j%j==0 & j%1==0) {
		    System.out.println(j);
		}
	   }
	}
    }
}
