/**
 * 
 */
package HoldingYourObjects;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author Oleg
 * 
 *         Exercise 28: (2) Fill a PriorityQueue (using offer( )) with Double
 *         values created using java.util.Random, then remove the elements using
 *         poll( ) and display them.
 */
public class Example28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		for (int i = 0; i < 10; i++)
			pq.offer(rand.nextDouble() * i);
		while (pq.peek() != null)
			System.out.print(pq.poll() + " ");
	}

}
