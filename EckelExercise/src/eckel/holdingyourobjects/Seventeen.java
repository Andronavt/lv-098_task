package eckel.holdingyourobjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * ex 17
 */

class Gerbiil {
    private int gerbilNumber;

    public Gerbiil(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbilnumber: " + gerbilNumber + " hop");
    }
}

public class Seventeen {
    public static void main(String[] args) {
	Map<String, Gerbbil> gerbils = new HashMap<String, Gerbbil>();
	gerbils.put("Fuzzy", new Gerbbil(0));
	gerbils.put("Spot", new Gerbbil(1));
	gerbils.put("Speedy", new Gerbbil(2));
	gerbils.put("Dopey", new Gerbbil(3));
	gerbils.put("Sleepy", new Gerbbil(4));
	gerbils.put("Happy", new Gerbbil(5));
	Iterator<String> it = gerbils.keySet().iterator();
	while (it.hasNext()) {
	    String s = it.next();
	    System.out.print(s + ": ");
	    gerbils.get(s).hop();
	}
    }
}
