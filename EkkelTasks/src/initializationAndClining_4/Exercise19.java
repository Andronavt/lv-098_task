/**
 * 
 */
package initializationAndClining_4;

import java.util.Arrays;

/**
 * @author Богдан
 *
 */
public class Exercise19 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	method("text");
	method("text1", "texxt2", "text3");
	String [] array = new String[5];
	Arrays.fill(array, "text0");
	method(array);

    }
    static void method(String ...args){
	for (String i:args){
	    System.out.print(" "+ i);
	}
	System.out.println();
    }

}
