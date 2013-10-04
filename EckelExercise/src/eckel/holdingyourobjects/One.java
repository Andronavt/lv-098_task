package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.List;

class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbilnumber: " + gerbilNumber + " hop");
    }
}

public class One {
    public static void main(String[] args) {
	List<Gerbil> list = new ArrayList();
	for (int i = 0; i < 10; i++) {
	    list.add(new Gerbil(i));
	}
	for (int i = 0; i < 10; i++) {
	    list.get(i).hop();
	}
	System.out.println("-----------");
	for (Gerbil g : list) {
	    g.hop();
	}
    }
}
