package eckel.holdingyourobjects;

import java.util.PriorityQueue;

/*/
 * ex 29
 */

class A extends Object {

}

public class TwentyNine {
    public static void main(String[] args) {
	PriorityQueue<A> pq = new PriorityQueue<A>();
	pq.offer(new A());
	// ClassCastException
	// pq.offer(new NineA());
    }

}
