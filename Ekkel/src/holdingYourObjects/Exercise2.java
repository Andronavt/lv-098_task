/**
 * 
 */
package holdingYourObjects;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author orecto
 * 
 */
/* Modify SimpleCollection.java to use a Set for c */
public class Exercise2 {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		for (int i = 0; i < 10; i++)
			c.add(i); 
		for (Integer i : c)
			System.out.print(i + ", ");
	}
}
