/**
 * 
 */
package holdingYourObjects_10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Богдан
 * 
 */
public class Exercise24 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Random rand = new Random();
	TreeSet<String> ts = new TreeSet();
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
	Map<String, Integer> outMap = new LinkedHashMap<>();
	for (int i = 0; i < 10; i++) {
	    lhm.put("key#" + rand.nextInt(10), i * 10);
	}
	System.out.println("In: " + lhm.toString());
	Set<String> s =lhm.keySet();
	Iterator iter2 = s.iterator();
	while(iter2.hasNext()){
	    ts.add((String)iter2.next());
	}
	Iterator iter = ts.iterator();
	while (iter.hasNext()) {
	    String tmp = (String) iter.next();
	    outMap.put(tmp, lhm.get(tmp));
	}
	System.out.println("Out: " + outMap.toString());

    }

}
