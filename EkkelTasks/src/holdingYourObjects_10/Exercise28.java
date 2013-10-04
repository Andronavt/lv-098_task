/**
 * Exercise 28:   (2) Fill a PriorityQueue (using offer( )) with Double values created 
 * using java.util.Random, then remove the elements using poll( ) and display them.  
 */
package holdingYourObjects_10;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise28 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Random rand = new Random(47);
	PriorityQueue<Double> pq = new PriorityQueue<>();
	for (int i = 0; i < 10; i++) {
	    pq.offer(rand.nextDouble());
	}
	while (!pq.isEmpty()) {
	    System.out.println(pq.poll());
	}

    }

}
