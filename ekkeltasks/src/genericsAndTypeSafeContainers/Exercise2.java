/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.HashSet;

/**
 * @author Andrew
 * 
 */
/* (1) Modify SimpleCollection.java to use a Set for c. */

class SimpleCollection {
    public static void main(String[] args) {
	HashSet<Integer> c = new HashSet<Integer>();
	for (int i = 0; i < 10; i++)
	    c.add(i); // Autoboxing
	for (Integer i : c)
	    System.out.print(i + ", ");
    }
}

public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	SimpleCollection.main(args);
    }

}
