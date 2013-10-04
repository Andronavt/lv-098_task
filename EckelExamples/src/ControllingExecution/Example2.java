/**
 * 
 */
package ControllingExecution;

import java.util.Random;

/**
 * @author Oleg
 *
 */
public class Example2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Random r1 = new Random();
	Random r2 = new Random();
	for(int i=0;i<25;i++)
	{
	    int val1= r1.nextInt(100);
	    int val2= r2.nextInt(100);
	    if(val1<val2) System.out.println(val1+" < "+val2);
	    else if(val1>val2) System.out.println(val1+" > "+val2);
	    else System.out.println(val1+" = "+val2);
	}
	
    }

}
