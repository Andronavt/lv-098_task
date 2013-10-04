/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Богдан
 * 
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ArrayList<Gerbil2> list = new ArrayList();
	for (int i = 1; i <= 5; i++) {
	    list.add(new Gerbil2(i));
	}
	Iterator<Gerbil2> iter = list.iterator();
	while (iter.hasNext()) {
	    iter.next().hop();
	}
    }

}

class Gerbil2 {
    private int gerbilNumber;

    Gerbil2(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbil2# " + gerbilNumber);
    }
}
