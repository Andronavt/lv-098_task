/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Богдан
 *
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	List<Integer> al = new ArrayList();
	for (int i = 0; i < 5; i++) {
	    al.add(i);
	}
	Set<String> hs = new HashSet();
	for (int i = 0; i < 5; i++) {
	    hs.add(String.valueOf(i));
	}
	colectionPrint(al);
	colectionPrint(hs);
	

    }
    public static void colectionPrint(Collection c){
	System.out.println(c.getClass());
	Iterator<Object> iter = c.iterator();
	while(iter.hasNext()){
	    System.out.println(iter.next());
	}
    } 

}
