/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Богдан
 *
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	List<Integer> list1 = new ArrayList(10);
	for (int i = 0; i < 10; i++) {
	    list1.add(i);
	}
	List<Integer> list2 = new ArrayList(list1.size());
	ListIterator<Integer> lIter = list1.listIterator();
	while(lIter.hasNext()){
	    lIter.next();
	}
	while(lIter.hasPrevious()){
	    list2.add(lIter.previous());
	}
	for(Integer i: list2) System.out.println(i);

    }

}
