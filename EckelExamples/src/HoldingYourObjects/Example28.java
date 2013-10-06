/**
 * 
 */
package HoldingYourObjects;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author Oleg
 * 
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
