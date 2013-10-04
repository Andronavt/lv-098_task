/**
 * 
 */
package ControllingExecution;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Oleg
 * 
 */
public class Example3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String sin="";
	Random r1 = new Random();
	Random r2 = new Random();
	while(!sin.equals("exit"))
	{
	    int val1= r1.nextInt(100);
	    int val2= r2.nextInt(100);
	    if(val1<val2) System.out.println(val1+" < "+val2);
	    else if(val1>val2) System.out.println(val1+" > "+val2);
	    else System.out.println(val1+" = "+val2);
	    sin=in.nextLine();
	    
	}
    }

}
