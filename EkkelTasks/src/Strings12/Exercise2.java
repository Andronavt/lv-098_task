/**
 * Exercise 2:   (1) Repair InfiniteRecursion.java.  
 */
package Strings12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ������
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	InfiniteRecursion.main(args);

    }

}

class InfiniteRecursion {
    public String toString() {
	return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
	List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
	for (int i = 0; i < 10; i++)
	    v.add(new InfiniteRecursion());
	System.out.println(v);
    }
}
