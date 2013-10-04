/**
 * 
 */
package holdingYourObjects_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Богдан
 * 
 */
public class Exercise17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Map<String, Gerbil17> map = new HashMap();
	map.put("Fuzzy", new Gerbil17(1));
	map.put("Spot", new Gerbil17(2));
	map.put("Spoty", new Gerbil17(3));
	Set<String> setOfKeys = map.keySet();
	Iterator<String> iter = setOfKeys.iterator();
	while (iter.hasNext()) {
	    map.get(iter.next()).hop();
	}

    }

}

class Gerbil17 {
    private int gerbilNumber;

    Gerbil17(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbil# " + gerbilNumber);
    }
}
