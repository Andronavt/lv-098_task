/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;

/**
 * @author Богдан
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ArrayList<Gerbil> list = new ArrayList();
	for (int i = 1; i <= 5; i++) {
	    list.add(new Gerbil(i));
	}
	for(Gerbil g : list){
	    g.hop();
	}

    }

}

class Gerbil {
    private int gerbilNumber;

    Gerbil(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbil# " + gerbilNumber);
    }
}