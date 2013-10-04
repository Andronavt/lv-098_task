/**
 * 
 */
package com.softserveinc.edu.lms.controlingExecution;

/**
 * @author Maryan
 *
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int countNumbers = 20;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < countNumbers) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
	
    }

}