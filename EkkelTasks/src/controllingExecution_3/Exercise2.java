/**
 * 
 */
package controllingExecution_3;


import java.util.Random;

/**
 * @author ������
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
   	int arg1;
   	int arg2;
   	Random rand = new Random();
   	for (int i = 1; i <= 25; i++) {
   	    arg1 = rand.nextInt(100);
   	    arg2 = rand.nextInt(100);
   	    if (arg1 > arg2) {
   		System.out.println("Element #" + i
   			+ " is  greater than second randomly generated value");
   	    } else if (arg1 == arg2) {
   		System.out.println("Element #" + i
   			+ " is  equal to second randomly generated value");
   	    } else {
   		System.out.println("Element #" + i
   			+ " is  less than second randomly generated value");
   	    }
   	}
       }
   }
