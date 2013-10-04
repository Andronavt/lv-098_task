/**
 * 
 */
package ControllingExecution;

/**
 * @author Oleg
 * 
 */
public class Example4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int checked = 0;
	for (int i = 1; i <= 100; i++) {
	    for (int j = 1; j <= i; j++) {
		if (i % j == 0 && i != j && j != 1) {
		    break;
		}
		if (i == j)
		    if ((++checked) % 10 == 0)
			System.out.println(i);
		    else
			System.out.print(i + "  ");
	    }
	}
    }

}
