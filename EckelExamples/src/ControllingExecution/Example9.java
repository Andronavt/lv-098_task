/**
 * 
 */
package ControllingExecution;

import java.util.Scanner;

/**
 * @author Oleg
 *
 */
public class Example9 {

    int fib(int n) {   
        if(n < 2) return 1;   
        return (fib(n - 2) + fib(n - 1));   
    }   
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Example9 ex9= new Example9();
	Scanner in = new Scanner(System.in);
	int n= in.nextInt();
	for(int i=0;i<n;i++)
	{
	    System.out.println(ex9.fib(i));
	}

    }

}
