/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Богдан
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Collection<Integer> c = new HashSet<Integer>();
	for (int i = 0; i < 10; i++)
	    c.add(i); // Autoboxing
	for (Integer i : c)
	    System.out.print(i + ", ");
    }

}
