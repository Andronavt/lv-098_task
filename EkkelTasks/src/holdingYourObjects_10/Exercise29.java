/**
 * Exercise 29:   (2) Create a simple class that inherits from Object and contains no
 * members, and show that you cannot successfully add multiple elements of that class to a
 * PriorityQueue. This issue will be fully explained in the Containers in Depth chapter.  
 */
package holdingYourObjects_10;

import java.util.PriorityQueue;

/**
 * @author Богдан
 *
 */
public class Exercise29 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	PriorityQueue<Test29> pq =new PriorityQueue<>();
	pq.offer(new Test29());
	pq.offer(new Test29());
	pq.offer(new Test29());
    }

}
class Test29 extends Object{
    
}
