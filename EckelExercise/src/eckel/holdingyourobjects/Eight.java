package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Gerbill {
    private int gerbilNumber;

    public Gerbill(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbilnumber: " + gerbilNumber + " hop");
    }
}

public class Eight {
    public static void main(String[] args) {
	List<Gerbill> list = new ArrayList<Gerbill>();
	for (int i = 0; i < 10; i++) {
	    list.add(new Gerbill(i));
	}
	for (int i = 0; i < 10; i++) {
	    list.get(i).hop();
	}
	System.out.println("-----------");
	Iterator<Gerbill> i = list.iterator();
	while (i.hasNext()) {
	    i.next().hop();
	}
    }
}
