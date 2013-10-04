/**
 * 
 */
package holdingYourObjects_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Богдан
 *
 */
public class Exercise19 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Set<Integer> hs = new HashSet();
	Set<Integer> ts = new TreeSet();
	Set<Integer> lhs = new LinkedHashSet();
	for (int i = 0; i < 10; i++) {
	    hs.add(i*10);
	}
	Iterator<Integer> iter1 = hs.iterator();
	while(iter1.hasNext()){
	    ts.add(iter1.next());
	}
	Iterator<Integer> iter2 = ts.iterator();
	while(iter2.hasNext()){
	    lhs.add(iter2.next());
	}
	System.out.println("Sorted LinkedHashSet");
	System.out.println(lhs.toString());
	
	
	

    }

}
