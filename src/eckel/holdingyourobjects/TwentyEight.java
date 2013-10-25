package eckel.holdingyourobjects;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * ex 28
 */

public class TwentyEight {
    public static void main(String[] args) {
	Random rand = new Random();
	PriorityQueue<Double> pq = new PriorityQueue<Double>();
	for (int i = 0; i < 10; i++) {
	    pq.offer(rand.nextDouble());
	}
	while (pq.peek() != null) {
	    System.out.println(pq.poll() + " ");
	}
    }

}
