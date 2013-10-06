/**
 * 
 */
package HoldingYourObjects;
import java.util.*;
/**
 * @author Oleg
 * 
 * 
 *         Exercise 29: (2) Create a simple class that inherits from Object and
 *         contains no members, and show that you cannot successfully add
 *         multiple elements of that class to a PriorityQueue. This issue will
 *         be fully explained in the Containers in Depth chapter.
 */
class MySimple extends Object {

}
public class Example29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<MySimple> a = new PriorityQueue<MySimple>();
		a.offer(new MySimple());
		// a.offer(new MySimple());
		// a.offer(new MySimple());
		System.out.println(a);
	}

}
