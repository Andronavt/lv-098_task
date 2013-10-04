/**
 * 
 */
package ControllingExecution;

/**
 * @author Oleg
 * 
 */
public class Example6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int a[] = new int[100];
	for (int i = 0; i < 100; i++) {
	    a[i] = i++;
	}

	for (int i = 0; i < 1000; i++) {
	    if (i == 74)
		break; // Out of for loop
	    if (i % 9 != 0)
		continue; // Next iteration
	    System.out.print(i + " ");
	}
	System.out.println();
	/**
	 * Using return and if(i==100)
	 */
	for (int i = 0; i < 1000; i++) {
	    if (i == 100)
		return; // Out of for loop
	    if (i % 9 != 0)
		continue; // Next iteration
	    System.out.print(i + " ");
	}
	
    }
}
